/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TableSource extends Component {
  private transient long swigCPtr;

  public TableSource(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.TableSource_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableSource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_TableSource(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TableSource safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.TableSource_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TableSource(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.TableSource_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.TableSource_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.TableSource_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TableSource(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.TableSource_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_filename(TableSource source) {
    opensimModelCommonJNI.TableSource_copyProperty_filename(swigCPtr, this, TableSource.getCPtr(source), source);
  }

  public String get_filename(int i) {
    return opensimModelCommonJNI.TableSource_get_filename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_filename(int i) {
    return new SWIGTYPE_p_std__string(opensimModelCommonJNI.TableSource_upd_filename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_filename(int i, String value) {
    opensimModelCommonJNI.TableSource_set_filename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_filename(String value) {
    return opensimModelCommonJNI.TableSource_append_filename(swigCPtr, this, value);
  }

  public void constructProperty_filename(String initValue) {
    opensimModelCommonJNI.TableSource_constructProperty_filename(swigCPtr, this, initValue);
  }

  public String get_filename() {
    return opensimModelCommonJNI.TableSource_get_filename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_filename() {
    return new SWIGTYPE_p_std__string(opensimModelCommonJNI.TableSource_upd_filename__SWIG_1(swigCPtr, this), false);
  }

  public void set_filename(String value) {
    opensimModelCommonJNI.TableSource_set_filename__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_tablename(TableSource source) {
    opensimModelCommonJNI.TableSource_copyProperty_tablename(swigCPtr, this, TableSource.getCPtr(source), source);
  }

  public String get_tablename(int i) {
    return opensimModelCommonJNI.TableSource_get_tablename__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_tablename(int i) {
    return new SWIGTYPE_p_std__string(opensimModelCommonJNI.TableSource_upd_tablename__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_tablename(int i, String value) {
    opensimModelCommonJNI.TableSource_set_tablename__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_tablename(String value) {
    return opensimModelCommonJNI.TableSource_append_tablename(swigCPtr, this, value);
  }

  public void constructProperty_tablename(String initValue) {
    opensimModelCommonJNI.TableSource_constructProperty_tablename(swigCPtr, this, initValue);
  }

  public String get_tablename() {
    return opensimModelCommonJNI.TableSource_get_tablename__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_tablename() {
    return new SWIGTYPE_p_std__string(opensimModelCommonJNI.TableSource_upd_tablename__SWIG_1(swigCPtr, this), false);
  }

  public void set_tablename(String value) {
    opensimModelCommonJNI.TableSource_set_tablename__SWIG_1(swigCPtr, this, value);
  }

  public void set_has_output_all_columns(boolean value) {
    opensimModelCommonJNI.TableSource__has_output_all_columns_set(swigCPtr, this, value);
  }

  public boolean get_has_output_all_columns() {
    return opensimModelCommonJNI.TableSource__has_output_all_columns_get(swigCPtr, this);
  }

  public void set_has_output_column(boolean value) {
    opensimModelCommonJNI.TableSource__has_output_column_set(swigCPtr, this, value);
  }

  public boolean get_has_output_column() {
    return opensimModelCommonJNI.TableSource__has_output_column_get(swigCPtr, this);
  }

  public TableSource() {
    this(opensimModelCommonJNI.new_TableSource__SWIG_0(), true);
  }

  public TableSource(TableSource arg0) {
    this(opensimModelCommonJNI.new_TableSource__SWIG_1(TableSource.getCPtr(arg0), arg0), true);
  }

  public TableSource(TimeSeriesTable table) {
    this(opensimModelCommonJNI.new_TableSource__SWIG_2(TimeSeriesTable.getCPtr(table), table), true);
  }

  public TableSource(String filename) {
    this(opensimModelCommonJNI.new_TableSource__SWIG_3(filename), true);
  }

  public TableSource(String filename, String tablename) {
    this(opensimModelCommonJNI.new_TableSource__SWIG_4(filename, tablename), true);
  }

  public TimeSeriesTable getTable() {
    return new TimeSeriesTable(opensimModelCommonJNI.TableSource_getTable(swigCPtr, this), true);
  }

  public void setTable(TimeSeriesTable table) {
    opensimModelCommonJNI.TableSource_setTable__SWIG_0(swigCPtr, this, TimeSeriesTable.getCPtr(table), table);
  }

  public void setTable(String filename) {
    opensimModelCommonJNI.TableSource_setTable__SWIG_1(swigCPtr, this, filename);
  }

  public void setTable(String filename, String tablename) {
    opensimModelCommonJNI.TableSource_setTable__SWIG_2(swigCPtr, this, filename, tablename);
  }

}
