/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Appearance extends OpenSimObject {
  private long swigCPtr;

  public Appearance(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.Appearance_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Appearance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_Appearance(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Appearance safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.Appearance_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Appearance(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.Appearance_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.Appearance_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.Appearance_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Appearance(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.Appearance_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_visible(Appearance source) {
    opensimModelSimulationJNI.Appearance_copyProperty_visible(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public boolean get_visible(int i) {
    return opensimModelSimulationJNI.Appearance_get_visible__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_visible(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Appearance_upd_visible__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_visible(int i, boolean value) {
    opensimModelSimulationJNI.Appearance_set_visible__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_visible(boolean value) {
    return opensimModelSimulationJNI.Appearance_append_visible(swigCPtr, this, value);
  }

  public void constructProperty_visible(boolean initValue) {
    opensimModelSimulationJNI.Appearance_constructProperty_visible(swigCPtr, this, initValue);
  }

  public boolean get_visible() {
    return opensimModelSimulationJNI.Appearance_get_visible__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_visible() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Appearance_upd_visible__SWIG_1(swigCPtr, this), false);
  }

  public void set_visible(boolean value) {
    opensimModelSimulationJNI.Appearance_set_visible__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_opacity(Appearance source) {
    opensimModelSimulationJNI.Appearance_copyProperty_opacity(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public double get_opacity(int i) {
    return opensimModelSimulationJNI.Appearance_get_opacity__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_opacity(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Appearance_upd_opacity__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_opacity(int i, double value) {
    opensimModelSimulationJNI.Appearance_set_opacity__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_opacity(double value) {
    return opensimModelSimulationJNI.Appearance_append_opacity(swigCPtr, this, value);
  }

  public void constructProperty_opacity(double initValue) {
    opensimModelSimulationJNI.Appearance_constructProperty_opacity(swigCPtr, this, initValue);
  }

  public double get_opacity() {
    return opensimModelSimulationJNI.Appearance_get_opacity__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_opacity() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Appearance_upd_opacity__SWIG_1(swigCPtr, this), false);
  }

  public void set_opacity(double value) {
    opensimModelSimulationJNI.Appearance_set_opacity__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_color(Appearance source) {
    opensimModelSimulationJNI.Appearance_copyProperty_color(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public Vec3 get_color(int i) {
    return new Vec3(opensimModelSimulationJNI.Appearance_get_color__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_color(int i) {
    return new Vec3(opensimModelSimulationJNI.Appearance_upd_color__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_color(int i, Vec3 value) {
    opensimModelSimulationJNI.Appearance_set_color__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_color(Vec3 value) {
    return opensimModelSimulationJNI.Appearance_append_color(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_color(Vec3 initValue) {
    opensimModelSimulationJNI.Appearance_constructProperty_color(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_color() {
    return new Vec3(opensimModelSimulationJNI.Appearance_get_color__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_color() {
    return new Vec3(opensimModelSimulationJNI.Appearance_upd_color__SWIG_1(swigCPtr, this), false);
  }

  public void set_color(Vec3 value) {
    opensimModelSimulationJNI.Appearance_set_color__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_SurfaceProperties(Appearance source) {
    opensimModelSimulationJNI.Appearance_copyProperty_SurfaceProperties(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public SurfaceProperties get_SurfaceProperties(int i) {
    return new SurfaceProperties(opensimModelSimulationJNI.Appearance_get_SurfaceProperties__SWIG_0(swigCPtr, this, i), false);
  }

  public SurfaceProperties upd_SurfaceProperties(int i) {
    return new SurfaceProperties(opensimModelSimulationJNI.Appearance_upd_SurfaceProperties__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_SurfaceProperties(int i, SurfaceProperties value) {
    opensimModelSimulationJNI.Appearance_set_SurfaceProperties__SWIG_0(swigCPtr, this, i, SurfaceProperties.getCPtr(value), value);
  }

  public int append_SurfaceProperties(SurfaceProperties value) {
    return opensimModelSimulationJNI.Appearance_append_SurfaceProperties(swigCPtr, this, SurfaceProperties.getCPtr(value), value);
  }

  public void constructProperty_SurfaceProperties(SurfaceProperties initValue) {
    opensimModelSimulationJNI.Appearance_constructProperty_SurfaceProperties(swigCPtr, this, SurfaceProperties.getCPtr(initValue), initValue);
  }

  public SurfaceProperties get_SurfaceProperties() {
    return new SurfaceProperties(opensimModelSimulationJNI.Appearance_get_SurfaceProperties__SWIG_1(swigCPtr, this), false);
  }

  public SurfaceProperties upd_SurfaceProperties() {
    return new SurfaceProperties(opensimModelSimulationJNI.Appearance_upd_SurfaceProperties__SWIG_1(swigCPtr, this), false);
  }

  public void set_SurfaceProperties(SurfaceProperties value) {
    opensimModelSimulationJNI.Appearance_set_SurfaceProperties__SWIG_1(swigCPtr, this, SurfaceProperties.getCPtr(value), value);
  }

  public void copyProperty_CurveProperties(Appearance source) {
    opensimModelSimulationJNI.Appearance_copyProperty_CurveProperties(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public CurveProperties get_CurveProperties(int i) {
    return new CurveProperties(opensimModelSimulationJNI.Appearance_get_CurveProperties__SWIG_0(swigCPtr, this, i), false);
  }

  public CurveProperties upd_CurveProperties(int i) {
    return new CurveProperties(opensimModelSimulationJNI.Appearance_upd_CurveProperties__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_CurveProperties(int i, CurveProperties value) {
    opensimModelSimulationJNI.Appearance_set_CurveProperties__SWIG_0(swigCPtr, this, i, CurveProperties.getCPtr(value), value);
  }

  public int append_CurveProperties(CurveProperties value) {
    return opensimModelSimulationJNI.Appearance_append_CurveProperties(swigCPtr, this, CurveProperties.getCPtr(value), value);
  }

  public void constructProperty_CurveProperties(CurveProperties initValue) {
    opensimModelSimulationJNI.Appearance_constructProperty_CurveProperties(swigCPtr, this, CurveProperties.getCPtr(initValue), initValue);
  }

  public CurveProperties get_CurveProperties() {
    return new CurveProperties(opensimModelSimulationJNI.Appearance_get_CurveProperties__SWIG_1(swigCPtr, this), false);
  }

  public CurveProperties upd_CurveProperties() {
    return new CurveProperties(opensimModelSimulationJNI.Appearance_upd_CurveProperties__SWIG_1(swigCPtr, this), false);
  }

  public void set_CurveProperties(CurveProperties value) {
    opensimModelSimulationJNI.Appearance_set_CurveProperties__SWIG_1(swigCPtr, this, CurveProperties.getCPtr(value), value);
  }

  public Appearance() {
    this(opensimModelSimulationJNI.new_Appearance(), true);
  }

  public DecorativeGeometry.Representation get_representation() {
    return DecorativeGeometry.Representation.swigToEnum(opensimModelSimulationJNI.Appearance_get_representation(swigCPtr, this));
  }

  public void set_representation(DecorativeGeometry.Representation rep) {
    opensimModelSimulationJNI.Appearance_set_representation(swigCPtr, this, rep.swigValue());
  }

}