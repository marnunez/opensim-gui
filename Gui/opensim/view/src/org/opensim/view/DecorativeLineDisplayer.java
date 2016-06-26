/*
 * Copyright (c)  2005-2008, Stanford University
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed 
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer. 
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.opensim.view;

import org.opensim.modeling.*;
import vtk.vtkActor;
import vtk.vtkLineSource;
import vtk.vtkPolyData;
import vtk.vtkTubeFilter;

public class DecorativeLineDisplayer extends DecorativeGeometryDisplayer {

    private final DecorativeLine agLocal;
    private vtkLineSource line = new vtkLineSource();
    private final vtkTubeFilter dFilter = new vtkTubeFilter();
   //protected OpenSimObject obj;
    /** 
     * Displayer for Wrap Geometry
     * @param ag
     * @param object 
     */
    DecorativeLineDisplayer(DecorativeLine ag) {
        agLocal = ag.clone();
        //if (ag.hasUserRef()) setObj(ag.getUserRefAsObject());

      }

    /**
     * Convert DecorativeGeometry object passed in to the corresponding vtk polyhedral representation.
     * Transform is passed in as well since the way it applies to PolyData depends on source
     */
    private vtkPolyData getPolyData() {
        //Geometry.GeometryType analyticType = ag.
        Vec3 p1 = agLocal.getPoint1();
        Vec3 p2 = agLocal.getPoint2();
        line.SetPoint1(p1.get(0), p1.get(1), p1.get(2));
        line.SetPoint2(p2.get(0), p2.get(1), p2.get(2));
        line.Modified();
        dFilter.SetInput(line.GetOutput());
        dFilter.SetRadius(.005);           
        return dFilter.GetOutput();
    }

 
    @Override
    void updateDisplayFromDecorativeGeometry() {
        vtkPolyData polyData = getPolyData();
        createAndConnectMapper(polyData);
        setXformAndAttributesFromDecorativeGeometry(agLocal);
    }

    @Override
    vtkActor getVisuals() {
       updateDisplayFromDecorativeGeometry();
       return this;
    }

    @Override
    int getBodyId() {
        return agLocal.getBodyId();
    }
    @Override
    int getIndexOnBody() {
        return agLocal.getIndexOnBody();
    }
/*
    @Override
    void copyAttributesFromDecorativeGeometry(DecorativeGeometry arg0) {
        DecorativeLine newLine = (DecorativeLine) arg0;
        setPoint1(newLine.getPoint1());
        setPoint2(newLine.getPoint2());
        line.SetPoint1(getPoint1().get(0),getPoint1().get(1),getPoint1().get(2));
        line.SetPoint2(getPoint2().get(0),getPoint2().get(1),getPoint2().get(2));
        line.Modified();
        super.copyAttributesFromDecorativeGeometry(arg0);
    }
*/
    @Override
    DecorativeGeometry getDecorativeGeometry() {
        return agLocal;
    }

    @Override
    void updateGeometry(DecorativeGeometry arg) {
        DecorativeLine arg0 = (DecorativeLine) arg;
        agLocal.setPoint1(new Vec3(arg0.getPoint1()));
        agLocal.setPoint2(new Vec3(arg0.getPoint2()));
        //System.out.println("NewLine"+agLocal.getPoint1().toString()+","+agLocal.getPoint2().toString());
        updateDisplayFromDecorativeGeometry();    
    }
    
}