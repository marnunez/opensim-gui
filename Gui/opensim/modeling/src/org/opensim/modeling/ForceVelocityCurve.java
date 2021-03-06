/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ForceVelocityCurve extends Function {
  private transient long swigCPtr;

  public ForceVelocityCurve(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ForceVelocityCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ForceVelocityCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ForceVelocityCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ForceVelocityCurve safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ForceVelocityCurve_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ForceVelocityCurve(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ForceVelocityCurve_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ForceVelocityCurve_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ForceVelocityCurve_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ForceVelocityCurve(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ForceVelocityCurve_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_concentric_slope_at_vmax(ForceVelocityCurve source) {
    opensimSimulationJNI.ForceVelocityCurve_copyProperty_concentric_slope_at_vmax(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_concentric_slope_at_vmax(int i) {
    return opensimSimulationJNI.ForceVelocityCurve_get_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_slope_at_vmax(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_slope_at_vmax(int i, double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_slope_at_vmax(double value) {
    return opensimSimulationJNI.ForceVelocityCurve_append_concentric_slope_at_vmax(swigCPtr, this, value);
  }

  public void constructProperty_concentric_slope_at_vmax(double initValue) {
    opensimSimulationJNI.ForceVelocityCurve_constructProperty_concentric_slope_at_vmax(swigCPtr, this, initValue);
  }

  public double get_concentric_slope_at_vmax() {
    return opensimSimulationJNI.ForceVelocityCurve_get_concentric_slope_at_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_slope_at_vmax() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_concentric_slope_at_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_slope_at_vmax(double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_concentric_slope_at_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_concentric_slope_near_vmax(ForceVelocityCurve source) {
    opensimSimulationJNI.ForceVelocityCurve_copyProperty_concentric_slope_near_vmax(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_concentric_slope_near_vmax(int i) {
    return opensimSimulationJNI.ForceVelocityCurve_get_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_slope_near_vmax(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_slope_near_vmax(int i, double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_slope_near_vmax(double value) {
    return opensimSimulationJNI.ForceVelocityCurve_append_concentric_slope_near_vmax(swigCPtr, this, value);
  }

  public void constructProperty_concentric_slope_near_vmax(double initValue) {
    opensimSimulationJNI.ForceVelocityCurve_constructProperty_concentric_slope_near_vmax(swigCPtr, this, initValue);
  }

  public double get_concentric_slope_near_vmax() {
    return opensimSimulationJNI.ForceVelocityCurve_get_concentric_slope_near_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_slope_near_vmax() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_concentric_slope_near_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_slope_near_vmax(double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_concentric_slope_near_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_isometric_slope(ForceVelocityCurve source) {
    opensimSimulationJNI.ForceVelocityCurve_copyProperty_isometric_slope(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_isometric_slope(int i) {
    return opensimSimulationJNI.ForceVelocityCurve_get_isometric_slope__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_isometric_slope(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_isometric_slope__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_isometric_slope(int i, double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_isometric_slope__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_isometric_slope(double value) {
    return opensimSimulationJNI.ForceVelocityCurve_append_isometric_slope(swigCPtr, this, value);
  }

  public void constructProperty_isometric_slope(double initValue) {
    opensimSimulationJNI.ForceVelocityCurve_constructProperty_isometric_slope(swigCPtr, this, initValue);
  }

  public double get_isometric_slope() {
    return opensimSimulationJNI.ForceVelocityCurve_get_isometric_slope__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_isometric_slope() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_isometric_slope__SWIG_1(swigCPtr, this), false);
  }

  public void set_isometric_slope(double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_isometric_slope__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_eccentric_slope_at_vmax(ForceVelocityCurve source) {
    opensimSimulationJNI.ForceVelocityCurve_copyProperty_eccentric_slope_at_vmax(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_eccentric_slope_at_vmax(int i) {
    return opensimSimulationJNI.ForceVelocityCurve_get_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_at_vmax(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_slope_at_vmax(int i, double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_slope_at_vmax(double value) {
    return opensimSimulationJNI.ForceVelocityCurve_append_eccentric_slope_at_vmax(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_slope_at_vmax(double initValue) {
    opensimSimulationJNI.ForceVelocityCurve_constructProperty_eccentric_slope_at_vmax(swigCPtr, this, initValue);
  }

  public double get_eccentric_slope_at_vmax() {
    return opensimSimulationJNI.ForceVelocityCurve_get_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_at_vmax() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_slope_at_vmax(double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_eccentric_slope_near_vmax(ForceVelocityCurve source) {
    opensimSimulationJNI.ForceVelocityCurve_copyProperty_eccentric_slope_near_vmax(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_eccentric_slope_near_vmax(int i) {
    return opensimSimulationJNI.ForceVelocityCurve_get_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_near_vmax(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_slope_near_vmax(int i, double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_slope_near_vmax(double value) {
    return opensimSimulationJNI.ForceVelocityCurve_append_eccentric_slope_near_vmax(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_slope_near_vmax(double initValue) {
    opensimSimulationJNI.ForceVelocityCurve_constructProperty_eccentric_slope_near_vmax(swigCPtr, this, initValue);
  }

  public double get_eccentric_slope_near_vmax() {
    return opensimSimulationJNI.ForceVelocityCurve_get_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_near_vmax() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_slope_near_vmax(double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_max_eccentric_velocity_force_multiplier(ForceVelocityCurve source) {
    opensimSimulationJNI.ForceVelocityCurve_copyProperty_max_eccentric_velocity_force_multiplier(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_max_eccentric_velocity_force_multiplier(int i) {
    return opensimSimulationJNI.ForceVelocityCurve_get_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_eccentric_velocity_force_multiplier(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_eccentric_velocity_force_multiplier(int i, double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_eccentric_velocity_force_multiplier(double value) {
    return opensimSimulationJNI.ForceVelocityCurve_append_max_eccentric_velocity_force_multiplier(swigCPtr, this, value);
  }

  public void constructProperty_max_eccentric_velocity_force_multiplier(double initValue) {
    opensimSimulationJNI.ForceVelocityCurve_constructProperty_max_eccentric_velocity_force_multiplier(swigCPtr, this, initValue);
  }

  public double get_max_eccentric_velocity_force_multiplier() {
    return opensimSimulationJNI.ForceVelocityCurve_get_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_eccentric_velocity_force_multiplier() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_eccentric_velocity_force_multiplier(double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_concentric_curviness(ForceVelocityCurve source) {
    opensimSimulationJNI.ForceVelocityCurve_copyProperty_concentric_curviness(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_concentric_curviness(int i) {
    return opensimSimulationJNI.ForceVelocityCurve_get_concentric_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_curviness(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_concentric_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_curviness(int i, double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_concentric_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_curviness(double value) {
    return opensimSimulationJNI.ForceVelocityCurve_append_concentric_curviness(swigCPtr, this, value);
  }

  public void constructProperty_concentric_curviness(double initValue) {
    opensimSimulationJNI.ForceVelocityCurve_constructProperty_concentric_curviness(swigCPtr, this, initValue);
  }

  public double get_concentric_curviness() {
    return opensimSimulationJNI.ForceVelocityCurve_get_concentric_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_curviness() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_concentric_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_curviness(double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_concentric_curviness__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_eccentric_curviness(ForceVelocityCurve source) {
    opensimSimulationJNI.ForceVelocityCurve_copyProperty_eccentric_curviness(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_eccentric_curviness(int i) {
    return opensimSimulationJNI.ForceVelocityCurve_get_eccentric_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_curviness(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_eccentric_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_curviness(int i, double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_eccentric_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_curviness(double value) {
    return opensimSimulationJNI.ForceVelocityCurve_append_eccentric_curviness(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_curviness(double initValue) {
    opensimSimulationJNI.ForceVelocityCurve_constructProperty_eccentric_curviness(swigCPtr, this, initValue);
  }

  public double get_eccentric_curviness() {
    return opensimSimulationJNI.ForceVelocityCurve_get_eccentric_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_curviness() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.ForceVelocityCurve_upd_eccentric_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_curviness(double value) {
    opensimSimulationJNI.ForceVelocityCurve_set_eccentric_curviness__SWIG_1(swigCPtr, this, value);
  }

  public ForceVelocityCurve() {
    this(opensimSimulationJNI.new_ForceVelocityCurve__SWIG_0(), true);
  }

  public ForceVelocityCurve(double concentricSlopeAtVmax, double concentricSlopeNearVmax, double isometricSlope, double eccentricSlopeAtVmax, double eccentricSlopeNearVmax, double maxEccentricVelocityForceMultiplier, double concentricCurviness, double eccentricCurviness) {
    this(opensimSimulationJNI.new_ForceVelocityCurve__SWIG_1(concentricSlopeAtVmax, concentricSlopeNearVmax, isometricSlope, eccentricSlopeAtVmax, eccentricSlopeNearVmax, maxEccentricVelocityForceMultiplier, concentricCurviness, eccentricCurviness), true);
  }

  public double getConcentricSlopeAtVmax() {
    return opensimSimulationJNI.ForceVelocityCurve_getConcentricSlopeAtVmax(swigCPtr, this);
  }

  public double getConcentricSlopeNearVmax() {
    return opensimSimulationJNI.ForceVelocityCurve_getConcentricSlopeNearVmax(swigCPtr, this);
  }

  public double getIsometricSlope() {
    return opensimSimulationJNI.ForceVelocityCurve_getIsometricSlope(swigCPtr, this);
  }

  public double getEccentricSlopeAtVmax() {
    return opensimSimulationJNI.ForceVelocityCurve_getEccentricSlopeAtVmax(swigCPtr, this);
  }

  public double getEccentricSlopeNearVmax() {
    return opensimSimulationJNI.ForceVelocityCurve_getEccentricSlopeNearVmax(swigCPtr, this);
  }

  public double getMaxEccentricVelocityForceMultiplier() {
    return opensimSimulationJNI.ForceVelocityCurve_getMaxEccentricVelocityForceMultiplier(swigCPtr, this);
  }

  public double getConcentricCurviness() {
    return opensimSimulationJNI.ForceVelocityCurve_getConcentricCurviness(swigCPtr, this);
  }

  public double getEccentricCurviness() {
    return opensimSimulationJNI.ForceVelocityCurve_getEccentricCurviness(swigCPtr, this);
  }

  public void setCurveShape(double aConcentricSlopeAtVmax, double aConcentricSlopeNearVmax, double aIsometricSlope, double aEccentricSlopeAtVmax, double aEccentricSlopeNearVmax, double aMaxForceMultiplier) {
    opensimSimulationJNI.ForceVelocityCurve_setCurveShape(swigCPtr, this, aConcentricSlopeAtVmax, aConcentricSlopeNearVmax, aIsometricSlope, aEccentricSlopeAtVmax, aEccentricSlopeNearVmax, aMaxForceMultiplier);
  }

  public void setConcentricCurviness(double aConcentricCurviness) {
    opensimSimulationJNI.ForceVelocityCurve_setConcentricCurviness(swigCPtr, this, aConcentricCurviness);
  }

  public void setEccentricCurviness(double aEccentricCurviness) {
    opensimSimulationJNI.ForceVelocityCurve_setEccentricCurviness(swigCPtr, this, aEccentricCurviness);
  }

  public double calcValue(Vector x) {
    return opensimSimulationJNI.ForceVelocityCurve_calcValue__SWIG_0(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcValue(double normFiberVelocity) {
    return opensimSimulationJNI.ForceVelocityCurve_calcValue__SWIG_1(swigCPtr, this, normFiberVelocity);
  }

  public double calcDerivative(double normFiberVelocity, int order) {
    return opensimSimulationJNI.ForceVelocityCurve_calcDerivative__SWIG_0(swigCPtr, this, normFiberVelocity, order);
  }

  public double calcDerivative(StdVectorInt derivComponents, Vector x) {
    return opensimSimulationJNI.ForceVelocityCurve_calcDerivative__SWIG_1(swigCPtr, this, StdVectorInt.getCPtr(derivComponents), derivComponents, Vector.getCPtr(x), x);
  }

  public Vec2 getCurveDomain() {
    return new Vec2(opensimSimulationJNI.ForceVelocityCurve_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path) {
    opensimSimulationJNI.ForceVelocityCurve_printMuscleCurveToCSVFile(swigCPtr, this, path);
  }

  public void ensureCurveUpToDate() {
    opensimSimulationJNI.ForceVelocityCurve_ensureCurveUpToDate(swigCPtr, this);
  }

}
