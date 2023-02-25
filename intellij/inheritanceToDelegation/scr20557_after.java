test;
[xxx] {
[SCR20557]
    package xxx;
  
  import java.sql.*;
  import java.util.Calendar;
  import java.util.Map;
  import java.io.InputStream;
  import java.io.Reader;
  import java.math.BigDecimal;
  import java.net.URL;
  
  public class SCR20557 {
  
      private final MyResultSet myResultSet = new MyResultSet();
  
      protected abstract Object getObject(int columnIndex, Map<String, Class<?>> map)
        throws SQLException;
  
      protected abstract Object getObject(String columnLabel, Map<String, Class<?>> map)
        throws SQLException;
  
      protected abstract RowId getRowId(int columnIndex) throws SQLException;
  
      protected abstract RowId getRowId(String columnLabel) throws SQLException;
  
      protected abstract void updateRowId(int columnIndex, RowId x) throws SQLException;
  
      protected abstract void updateRowId(String columnLabel, RowId x) throws SQLException;
  
      protected abstract int getHoldability() throws SQLException;
  
      protected abstract boolean isClosed() throws SQLException;
  
      protected abstract void updateNString(int columnIndex, String nString) throws SQLException;
  
      protected abstract void updateNString(String columnLabel, String nString) throws SQLException;
  
      protected abstract void updateNClob(int columnIndex, NClob nClob) throws SQLException;
  
      protected abstract void updateNClob(String columnLabel, NClob nClob) throws SQLException;
  
      protected abstract NClob getNClob(int columnIndex) throws SQLException;
  
      protected abstract NClob getNClob(String columnLabel) throws SQLException;
  
      protected abstract SQLXML getSQLXML(int columnIndex) throws SQLException;
  
      protected abstract SQLXML getSQLXML(String columnLabel) throws SQLException;
  
      protected abstract void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException;
  
      protected abstract void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException;
  
      protected abstract String getNString(int columnIndex) throws SQLException;
  
      protected abstract String getNString(String columnLabel) throws SQLException;
  
      protected abstract Reader getNCharacterStream(int columnIndex) throws SQLException;
  
      protected abstract Reader getNCharacterStream(String columnLabel) throws SQLException;
  
      protected abstract void updateNCharacterStream(int columnIndex,
                                                     Reader x,
                                                     long length) throws SQLException;
  
      protected abstract void updateNCharacterStream(String columnLabel,
                                                     Reader reader,
                                                     long length) throws SQLException;
  
      protected abstract void updateAsciiStream(int columnIndex,
                                                InputStream x,
                                                long length) throws SQLException;
  
      protected abstract void updateBinaryStream(int columnIndex,
                                                 InputStream x,
                                                 long length) throws SQLException;
  
      protected abstract void updateCharacterStream(int columnIndex,
                                                    Reader x,
                                                    long length) throws SQLException;
  
      protected abstract void updateAsciiStream(String columnLabel,
                                                InputStream x,
                                                long length) throws SQLException;
  
      protected abstract void updateBinaryStream(String columnLabel,
                                                 InputStream x,
                                                 long length) throws SQLException;
  
      protected abstract void updateCharacterStream(String columnLabel,
                                                    Reader reader,
                                                    long length) throws SQLException;
  
      protected abstract void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException;
  
      protected abstract void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException;
  
      protected abstract void updateClob(int columnIndex, Reader reader, long length) throws SQLException;
  
      protected abstract void updateClob(String columnLabel, Reader reader, long length) throws SQLException;
  
      protected abstract void updateNClob(int columnIndex, Reader reader, long length) throws SQLException;
  
      protected abstract void updateNClob(String columnLabel, Reader reader, long length) throws SQLException;
  
      protected abstract void updateNCharacterStream(int columnIndex,
                                                     Reader x) throws SQLException;
  
      protected abstract void updateNCharacterStream(String columnLabel,
                                                     Reader reader) throws SQLException;
  
      protected abstract void updateAsciiStream(int columnIndex,
                                                InputStream x) throws SQLException;
  
      protected abstract void updateBinaryStream(int columnIndex,
                                                 InputStream x) throws SQLException;
  
      protected abstract void updateCharacterStream(int columnIndex,
                                                    Reader x) throws SQLException;
  
      protected abstract void updateAsciiStream(String columnLabel,
                                                InputStream x) throws SQLException;
  
      protected abstract void updateBinaryStream(String columnLabel,
                                                 InputStream x) throws SQLException;
  
      protected abstract void updateCharacterStream(String columnLabel,
                                                    Reader reader) throws SQLException;
  
      protected abstract void updateBlob(int columnIndex, InputStream inputStream) throws SQLException;
  
      protected abstract void updateBlob(String columnLabel, InputStream inputStream) throws SQLException;
  
      protected abstract void updateClob(int columnIndex, Reader reader) throws SQLException;
  
      protected abstract void updateClob(String columnLabel, Reader reader) throws SQLException;
  
      protected abstract void updateNClob(int columnIndex, Reader reader) throws SQLException;
  
      protected abstract void updateNClob(String columnLabel, Reader reader) throws SQLException;
  
      protected abstract <T> T getObject(int columnIndex, Class<T> type) throws SQLException;
  
      protected abstract <T> T getObject(String columnLabel, Class<T> type) throws SQLException;
  
      public java.sql.Date getDate(int columnIndex) throws SQLException {
          return myResultSet.getDate(columnIndex);
      }
  
      public java.sql.Date getDate(String columnLabel) throws SQLException {
          return myResultSet.getDate(columnLabel);
      }
  
      public java.sql.Date getDate(int columnIndex, Calendar cal) throws SQLException {
          return myResultSet.getDate(columnIndex, cal);
      }
  
      public java.sql.Date getDate(String columnLabel, Calendar cal) throws SQLException {
          return myResultSet.getDate(columnLabel, cal);
      }
  
      private class MyResultSet implements ResultSet {
          public void updateLong(int columnIndex, long x) throws SQLException {
          }
  
          public void updateLong(String columnName, long x) throws SQLException {
          }
  
          public boolean getBoolean(int columnIndex) throws SQLException {
            return false;
          }
  
          public boolean getBoolean(String columnName) throws SQLException {
            return false;
          }
  
          public boolean wasNull() throws SQLException {
            return false;
          }
  
          public int getRow() throws SQLException {
            return 0;
          }
  
          public int getConcurrency() throws SQLException {
            return 0;
          }
  
          public int getFetchSize() throws SQLException {
            return 0;
          }
  
          public Ref getRef(int i) throws SQLException {
            return null;
          }
  
          public Ref getRef(String colName) throws SQLException {
            return null;
          }
  
          public Date getDate(int columnIndex) throws SQLException {
            return null;
          }
  
          public Date getDate(String columnName) throws SQLException {
            return null;
          }
  
          public Date getDate(int columnIndex, Calendar cal) throws SQLException {
            return null;
          }
  
          public Date getDate(String columnName, Calendar cal) throws SQLException {
            return null;
          }
  
          public Statement getStatement() throws SQLException {
            return null;
          }
  
          public boolean isFirst() throws SQLException {
            return false;
          }
  
          public boolean previous() throws SQLException {
            return false;
          }
  
          public void updateFloat(int columnIndex, float x) throws SQLException {
          }
  
          public void updateFloat(String columnName, float x) throws SQLException {
          }
  
          public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
          }
  
          public void updateBinaryStream(String columnName, InputStream x, int length) throws SQLException {
          }
  
          public void updateRow() throws SQLException {
          }
  
          public long getLong(int columnIndex) throws SQLException {
            return 0;
          }
  
          public long getLong(String columnName) throws SQLException {
            return 0;
          }
  
          public void updateRef(int columnIndex, Ref x) throws SQLException {
          }
  
          public void updateRef(String columnName, Ref x) throws SQLException {
          }
  
          public void updateByte(int columnIndex, byte x) throws SQLException {
          }
  
          public void updateByte(String columnName, byte x) throws SQLException {
          }
  
          public void cancelRowUpdates() throws SQLException {
          }
  
          public Reader getCharacterStream(int columnIndex) throws SQLException {
            return null;
          }
  
          public Reader getCharacterStream(String columnName) throws SQLException {
            return null;
          }
  
          public boolean absolute(int row) throws SQLException {
            return false;
          }
  
          public boolean first() throws SQLException {
            return false;
          }
  
          public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
          }
  
          public void updateAsciiStream(String columnName, InputStream x, int length) throws SQLException {
          }
  
          public void moveToInsertRow() throws SQLException {
          }
  
          public SQLWarning getWarnings() throws SQLException {
            return null;
          }
  
          public void updateDate(int columnIndex, Date x) throws SQLException {
          }
  
          public void updateDate(String columnName, Date x) throws SQLException {
          }
  
          public InputStream getBinaryStream(int columnIndex) throws SQLException {
            return null;
          }
  
          public InputStream getBinaryStream(String columnName) throws SQLException {
            return null;
          }
  
          public Time getTime(int columnIndex) throws SQLException {
            return null;
          }
  
          public Time getTime(String columnName) throws SQLException {
            return null;
          }
  
          public Time getTime(int columnIndex, Calendar cal) throws SQLException {
            return null;
          }
  
          public Time getTime(String columnName, Calendar cal) throws SQLException {
            return null;
          }
  
          public String getCursorName() throws SQLException {
            return null;
          }
  
          public void updateBytes(int columnIndex, byte x[]) throws SQLException {
          }
  
          public void updateBytes(String columnName, byte x[]) throws SQLException {
          }
  
          public boolean last() throws SQLException {
            return false;
          }
  
          public Timestamp getTimestamp(int columnIndex) throws SQLException {
            return null;
          }
  
          public Timestamp getTimestamp(String columnName) throws SQLException {
            return null;
          }
  
          public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
            return null;
          }
  
          public Timestamp getTimestamp(String columnName, Calendar cal) throws SQLException {
            return null;
          }
  
          public void updateBoolean(int columnIndex, boolean x) throws SQLException {
          }
  
          public void updateBoolean(String columnName, boolean x) throws SQLException {
          }
  
          public void beforeFirst() throws SQLException {
          }
  
          public int getFetchDirection() throws SQLException {
            return 0;
          }
  
          public void updateDouble(int columnIndex, double x) throws SQLException {
          }
  
          public void updateDouble(String columnName, double x) throws SQLException {
          }
  
          public void setFetchDirection(int direction) throws SQLException {
          }
  
          public boolean rowDeleted() throws SQLException {
            return false;
          }
  
          public void moveToCurrentRow() throws SQLException {
          }
  
          public void insertRow() throws SQLException {
          }
  
          public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
            return null;
          }
  
          public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
            return null;
          }
  
          public BigDecimal getBigDecimal(String columnName) throws SQLException {
            return null;
          }
  
          public BigDecimal getBigDecimal(String columnName, int scale) throws SQLException {
            return null;
          }
  
          public URL getURL(int columnIndex) throws SQLException {
            return null;
          }
  
          public URL getURL(String columnName) throws SQLException {
            return null;
          }
  
          public boolean isAfterLast() throws SQLException {
            return false;
          }
  
          public short getShort(int columnIndex) throws SQLException {
            return 0;
          }
  
          public short getShort(String columnName) throws SQLException {
            return 0;
          }
  
          public void updateInt(int columnIndex, int x) throws SQLException {
          }
  
          public void updateInt(String columnName, int x) throws SQLException {
          }
  
          public void clearWarnings() throws SQLException {
          }
  
          public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
          }
  
          public void updateCharacterStream(String columnName, Reader reader, int length) throws SQLException {
          }
  
          public Blob getBlob(int i) throws SQLException {
            return null;
          }
  
          public Blob getBlob(String colName) throws SQLException {
            return null;
          }
  
          public void refreshRow() throws SQLException {
          }
  
          public void updateTime(int columnIndex, Time x) throws SQLException {
          }
  
          public void updateTime(String columnName, Time x) throws SQLException {
          }
  
          public void updateArray(int columnIndex, Array x) throws SQLException {
          }
  
          public void updateArray(String columnName, Array x) throws SQLException {
          }
  
          public void updateObject(int columnIndex, Object x) throws SQLException {
          }
  
          public void updateObject(int columnIndex, Object x, int scale) throws SQLException {
          }
  
          public void updateObject(String columnName, Object x) throws SQLException {
          }
  
          public void updateObject(String columnName, Object x, int scale) throws SQLException {
          }
  
          public void updateNull(int columnIndex) throws SQLException {
          }
  
          public void updateNull(String columnName) throws SQLException {
          }
  
          public void close() throws SQLException {
          }
  
          public boolean rowInserted() throws SQLException {
            return false;
          }
  
          public Clob getClob(int i) throws SQLException {
            return null;
          }
  
          public Clob getClob(String colName) throws SQLException {
            return null;
          }
  
          public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
          }
  
          public void updateBigDecimal(String columnName, BigDecimal x) throws SQLException {
          }
  
          public int getType() throws SQLException {
            return 0;
          }
  
          public boolean next() throws SQLException {
            return false;
          }
  
          public int getInt(int columnIndex) throws SQLException {
            return 0;
          }
  
          public int getInt(String columnName) throws SQLException {
            return 0;
          }
  
          public void updateBlob(int columnIndex, Blob x) throws SQLException {
          }
  
          public void updateBlob(String columnName, Blob x) throws SQLException {
          }
  
          public ResultSetMetaData getMetaData() throws SQLException {
            return null;
          }
  
          public boolean rowUpdated() throws SQLException {
            return false;
          }
  
          public Array getArray(int i) throws SQLException {
            return null;
          }
  
          public Array getArray(String colName) throws SQLException {
            return null;
          }
  
          public byte getByte(int columnIndex) throws SQLException {
            return 0;
          }
  
          public byte getByte(String columnName) throws SQLException {
            return 0;
          }
  
          public InputStream getAsciiStream(int columnIndex) throws SQLException {
            return null;
          }
  
          public InputStream getAsciiStream(String columnName) throws SQLException {
            return null;
          }
  
          public double getDouble(int columnIndex) throws SQLException {
            return 0;
          }
  
          public double getDouble(String columnName) throws SQLException {
            return 0;
          }
  
          public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
          }
  
          public void updateTimestamp(String columnName, Timestamp x) throws SQLException {
          }
  
          public void updateClob(int columnIndex, Clob x) throws SQLException {
          }
  
          public void updateClob(String columnName, Clob x) throws SQLException {
          }
  
          public boolean isBeforeFirst() throws SQLException {
            return false;
          }
  
          public void deleteRow() throws SQLException {
          }
  
          public void afterLast() throws SQLException {
          }
  
          public InputStream getUnicodeStream(int columnIndex) throws SQLException {
            return null;
          }
  
          public InputStream getUnicodeStream(String columnName) throws SQLException {
            return null;
          }
  
          public byte[] getBytes(int columnIndex) throws SQLException {
            return new byte[0];
          }
  
          public byte[] getBytes(String columnName) throws SQLException {
            return new byte[0];
          }
  
          public void updateString(int columnIndex, String x) throws SQLException {
          }
  
          public void updateString(String columnName, String x) throws SQLException {
          }
  
          public float getFloat(int columnIndex) throws SQLException {
            return 0;
          }
  
          public float getFloat(String columnName) throws SQLException {
            return 0;
          }
  
          public Object getObject(int columnIndex) throws SQLException {
            return null;
          }
  
          public Object getObject(String columnName) throws SQLException {
            return null;
          }
  
          public Object getObject(int i, Map map) throws SQLException {
            return null;
          }
  
          public Object getObject(String colName, Map map) throws SQLException {
            return null;
          }
  
          public void setFetchSize(int rows) throws SQLException {
          }
  
          public boolean isLast() throws SQLException {
            return false;
          }
  
          public void updateShort(int columnIndex, short x) throws SQLException {
          }
  
          public void updateShort(String columnName, short x) throws SQLException {
          }
  
          public String getString(int columnIndex) throws SQLException {
            return null;
          }
  
          public String getString(String columnName) throws SQLException {
            return null;
          }
  
          public int findColumn(String columnName) throws SQLException {
            return 0;
          }
  
          public boolean relative(int rows) throws SQLException {
            return false;
          }
  
          public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
              return SCR20557.this.getObject(columnIndex, map);
          }
  
          public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
              return SCR20557.this.getObject(columnLabel, map);
          }
  
          public RowId getRowId(int columnIndex) throws SQLException {
              return SCR20557.this.getRowId(columnIndex);
          }
  
          public RowId getRowId(String columnLabel) throws SQLException {
              return SCR20557.this.getRowId(columnLabel);
          }
  
          public void updateRowId(int columnIndex, RowId x) throws SQLException {
              SCR20557.this.updateRowId(columnIndex, x);
          }
  
          public void updateRowId(String columnLabel, RowId x) throws SQLException {
              SCR20557.this.updateRowId(columnLabel, x);
          }
  
          public int getHoldability() throws SQLException {
              return SCR20557.this.getHoldability();
          }
  
          public boolean isClosed() throws SQLException {
              return SCR20557.this.isClosed();
          }
  
          public void updateNString(int columnIndex, String nString) throws SQLException {
              SCR20557.this.updateNString(columnIndex, nString);
          }
  
          public void updateNString(String columnLabel, String nString) throws SQLException {
              SCR20557.this.updateNString(columnLabel, nString);
          }
  
          public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
              SCR20557.this.updateNClob(columnIndex, nClob);
          }
  
          public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
              SCR20557.this.updateNClob(columnLabel, nClob);
          }
  
          public NClob getNClob(int columnIndex) throws SQLException {
              return SCR20557.this.getNClob(columnIndex);
          }
  
          public NClob getNClob(String columnLabel) throws SQLException {
              return SCR20557.this.getNClob(columnLabel);
          }
  
          public SQLXML getSQLXML(int columnIndex) throws SQLException {
              return SCR20557.this.getSQLXML(columnIndex);
          }
  
          public SQLXML getSQLXML(String columnLabel) throws SQLException {
              return SCR20557.this.getSQLXML(columnLabel);
          }
  
          public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
              SCR20557.this.updateSQLXML(columnIndex, xmlObject);
          }
  
          public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
              SCR20557.this.updateSQLXML(columnLabel, xmlObject);
          }
  
          public String getNString(int columnIndex) throws SQLException {
              return SCR20557.this.getNString(columnIndex);
          }
  
          public String getNString(String columnLabel) throws SQLException {
              return SCR20557.this.getNString(columnLabel);
          }
  
          public Reader getNCharacterStream(int columnIndex) throws SQLException {
              return SCR20557.this.getNCharacterStream(columnIndex);
          }
  
          public Reader getNCharacterStream(String columnLabel) throws SQLException {
              return SCR20557.this.getNCharacterStream(columnLabel);
          }
  
          public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
              SCR20557.this.updateNCharacterStream(columnIndex, x, length);
          }
  
          public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
              SCR20557.this.updateNCharacterStream(columnLabel, reader, length);
          }
  
          public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
              SCR20557.this.updateAsciiStream(columnIndex, x, length);
          }
  
          public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
              SCR20557.this.updateBinaryStream(columnIndex, x, length);
          }
  
          public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
              SCR20557.this.updateCharacterStream(columnIndex, x, length);
          }
  
          public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
              SCR20557.this.updateAsciiStream(columnLabel, x, length);
          }
  
          public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
              SCR20557.this.updateBinaryStream(columnLabel, x, length);
          }
  
          public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
              SCR20557.this.updateCharacterStream(columnLabel, reader, length);
          }
  
          public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
              SCR20557.this.updateBlob(columnIndex, inputStream, length);
          }
  
          public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
              SCR20557.this.updateBlob(columnLabel, inputStream, length);
          }
  
          public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
              SCR20557.this.updateClob(columnIndex, reader, length);
          }
  
          public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
              SCR20557.this.updateClob(columnLabel, reader, length);
          }
  
          public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
              SCR20557.this.updateNClob(columnIndex, reader, length);
          }
  
          public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
              SCR20557.this.updateNClob(columnLabel, reader, length);
          }
  
          public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
              SCR20557.this.updateNCharacterStream(columnIndex, x);
          }
  
          public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
              SCR20557.this.updateNCharacterStream(columnLabel, reader);
          }
  
          public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
              SCR20557.this.updateAsciiStream(columnIndex, x);
          }
  
          public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
              SCR20557.this.updateBinaryStream(columnIndex, x);
          }
  
          public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
              SCR20557.this.updateCharacterStream(columnIndex, x);
          }
  
          public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
              SCR20557.this.updateAsciiStream(columnLabel, x);
          }
  
          public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
              SCR20557.this.updateBinaryStream(columnLabel, x);
          }
  
          public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
              SCR20557.this.updateCharacterStream(columnLabel, reader);
          }
  
          public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
              SCR20557.this.updateBlob(columnIndex, inputStream);
          }
  
          public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
              SCR20557.this.updateBlob(columnLabel, inputStream);
          }
  
          public void updateClob(int columnIndex, Reader reader) throws SQLException {
              SCR20557.this.updateClob(columnIndex, reader);
          }
  
          public void updateClob(String columnLabel, Reader reader) throws SQLException {
              SCR20557.this.updateClob(columnLabel, reader);
          }
  
          public void updateNClob(int columnIndex, Reader reader) throws SQLException {
              SCR20557.this.updateNClob(columnIndex, reader);
          }
  
          public void updateNClob(String columnLabel, Reader reader) throws SQLException {
              SCR20557.this.updateNClob(columnLabel, reader);
          }
  
          public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
              return SCR20557.this.getObject(columnIndex, type);
          }
  
          public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
              return SCR20557.this.getObject(columnLabel, type);
          }
      }
  }
  
}
[java.sql] {
[ResultSet]
    package java.sql;
  
  import java.util.Calendar;
  import java.util.Map;
  import java.io.InputStream;
  import java.io.Reader;
  import java.math.BigDecimal;
  import java.net.URL;
  
  public interface ResultSet {
  
    boolean next() throws SQLException;
  
    void close() throws SQLException;
  
    boolean wasNull() throws SQLException;
  
    String getString(int columnIndex) throws SQLException;
  
    boolean getBoolean(int columnIndex) throws SQLException;
  
    byte getByte(int columnIndex) throws SQLException;
  
    short getShort(int columnIndex) throws SQLException;
  
    int getInt(int columnIndex) throws SQLException;
  
    long getLong(int columnIndex) throws SQLException;
  
    float getFloat(int columnIndex) throws SQLException;
  
  
    double getDouble(int columnIndex) throws SQLException;
  
    @Deprecated
    BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException;
  
  
    byte[] getBytes(int columnIndex) throws SQLException;
  
  
    java.sql.Date getDate(int columnIndex) throws SQLException;
  
  
    java.sql.Time getTime(int columnIndex) throws SQLException;
  
  
    java.sql.Timestamp getTimestamp(int columnIndex) throws SQLException;
  
  
    java.io.InputStream getAsciiStream(int columnIndex) throws SQLException;
  
  
    @Deprecated
    java.io.InputStream getUnicodeStream(int columnIndex) throws SQLException;
  
  
    java.io.InputStream getBinaryStream(int columnIndex)
      throws SQLException;
  
  
    // Methods for accessing results by column label
  
  
    String getString(String columnLabel) throws SQLException;
  
  
    boolean getBoolean(String columnLabel) throws SQLException;
  
  
    byte getByte(String columnLabel) throws SQLException;
  
  
    short getShort(String columnLabel) throws SQLException;
  
  
    int getInt(String columnLabel) throws SQLException;
  
  
    long getLong(String columnLabel) throws SQLException;
  
  
    float getFloat(String columnLabel) throws SQLException;
  
  
    double getDouble(String columnLabel) throws SQLException;
  
  
    @Deprecated
    BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException;
  
  
    byte[] getBytes(String columnLabel) throws SQLException;
  
  
    java.sql.Date getDate(String columnLabel) throws SQLException;
  
  
    java.sql.Time getTime(String columnLabel) throws SQLException;
  
  
    java.sql.Timestamp getTimestamp(String columnLabel) throws SQLException;
  
  
    java.io.InputStream getAsciiStream(String columnLabel) throws SQLException;
  
  
    @Deprecated
    java.io.InputStream getUnicodeStream(String columnLabel) throws SQLException;
  
  
    java.io.InputStream getBinaryStream(String columnLabel)
      throws SQLException;
  
  
    // Advanced features:
  
  
    SQLWarning getWarnings() throws SQLException;
  
  
    void clearWarnings() throws SQLException;
  
  
    String getCursorName() throws SQLException;
  
  
    ResultSetMetaData getMetaData() throws SQLException;
  
  
    Object getObject(int columnIndex) throws SQLException;
  
  
    Object getObject(String columnLabel) throws SQLException;
  
    //----------------------------------------------------------------
  
  
    int findColumn(String columnLabel) throws SQLException;
  
  
    //--------------------------JDBC 2.0-----------------------------------
  
    //---------------------------------------------------------------------
    // Getters and Setters
    //---------------------------------------------------------------------
  
  
    java.io.Reader getCharacterStream(int columnIndex) throws SQLException;
  
  
    java.io.Reader getCharacterStream(String columnLabel) throws SQLException;
  
  
    BigDecimal getBigDecimal(int columnIndex) throws SQLException;
  
  
    BigDecimal getBigDecimal(String columnLabel) throws SQLException;
  
    //---------------------------------------------------------------------
    // Traversal/Positioning
    //---------------------------------------------------------------------
  
  
    boolean isBeforeFirst() throws SQLException;
  
  
    boolean isAfterLast() throws SQLException;
  
  
    boolean isFirst() throws SQLException;
  
  
    boolean isLast() throws SQLException;
  
  
    void beforeFirst() throws SQLException;
  
  
    void afterLast() throws SQLException;
  
  
    boolean first() throws SQLException;
  
  
    boolean last() throws SQLException;
  
  
    int getRow() throws SQLException;
  
    boolean absolute( int row ) throws SQLException;
  
  
    boolean relative( int rows ) throws SQLException;
  
  
    boolean previous() throws SQLException;
  
    //---------------------------------------------------------------------
    // Properties
    //---------------------------------------------------------------------
  
  
    int FETCH_FORWARD = 1000;
  
  
    int FETCH_REVERSE = 1001;
  
  
    int FETCH_UNKNOWN = 1002;
  
  
    void setFetchDirection(int direction) throws SQLException;
  
  
    int getFetchDirection() throws SQLException;
  
  
    void setFetchSize(int rows) throws SQLException;
  
  
    int getFetchSize() throws SQLException;
  
  
    int TYPE_FORWARD_ONLY = 1003;
  
  
    int TYPE_SCROLL_INSENSITIVE = 1004;
  
  
    int TYPE_SCROLL_SENSITIVE = 1005;
  
  
    int getType() throws SQLException;
  
  
    int CONCUR_READ_ONLY = 1007;
  
  
    int CONCUR_UPDATABLE = 1008;
  
  
    int getConcurrency() throws SQLException;
  
    //---------------------------------------------------------------------
    // Updates
    //---------------------------------------------------------------------
  
  
    boolean rowUpdated() throws SQLException;
  
  
    boolean rowInserted() throws SQLException;
  
  
    boolean rowDeleted() throws SQLException;
  
  
    void updateNull(int columnIndex) throws SQLException;
  
  
    void updateBoolean(int columnIndex, boolean x) throws SQLException;
  
  
    void updateByte(int columnIndex, byte x) throws SQLException;
  
  
    void updateShort(int columnIndex, short x) throws SQLException;
  
  
    void updateInt(int columnIndex, int x) throws SQLException;
  
  
    void updateLong(int columnIndex, long x) throws SQLException;
  
  
    void updateFloat(int columnIndex, float x) throws SQLException;
  
  
    void updateDouble(int columnIndex, double x) throws SQLException;
  
  
    void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException;
  
  
    void updateString(int columnIndex, String x) throws SQLException;
  
  
    void updateBytes(int columnIndex, byte x[]) throws SQLException;
  
  
    void updateDate(int columnIndex, java.sql.Date x) throws SQLException;
  
  
    void updateTime(int columnIndex, java.sql.Time x) throws SQLException;
  
  
    void updateTimestamp(int columnIndex, java.sql.Timestamp x)
      throws SQLException;
  
  
    void updateAsciiStream(int columnIndex,
                           java.io.InputStream x,
                           int length) throws SQLException;
  
  
    void updateBinaryStream(int columnIndex,
                            java.io.InputStream x,
                            int length) throws SQLException;
  
  
    void updateCharacterStream(int columnIndex,
                               java.io.Reader x,
                               int length) throws SQLException;
  
  
    void updateObject(int columnIndex, Object x, int scaleOrLength)
      throws SQLException;
  
  
    void updateObject(int columnIndex, Object x) throws SQLException;
  
  
    void updateNull(String columnLabel) throws SQLException;
  
  
    void updateBoolean(String columnLabel, boolean x) throws SQLException;
  
  
    void updateByte(String columnLabel, byte x) throws SQLException;
  
  
    void updateShort(String columnLabel, short x) throws SQLException;
  
  
    void updateInt(String columnLabel, int x) throws SQLException;
  
  
    void updateLong(String columnLabel, long x) throws SQLException;
  
  
    void updateFloat(String columnLabel, float x) throws SQLException;
  
  
    void updateDouble(String columnLabel, double x) throws SQLException;
  
  
    void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException;
  
  
    void updateString(String columnLabel, String x) throws SQLException;
  
  
    void updateBytes(String columnLabel, byte x[]) throws SQLException;
  
  
    void updateDate(String columnLabel, java.sql.Date x) throws SQLException;
  
  
    void updateTime(String columnLabel, java.sql.Time x) throws SQLException;
  
  
    void updateTimestamp(String columnLabel, java.sql.Timestamp x)
      throws SQLException;
  
  
    void updateAsciiStream(String columnLabel,
                           java.io.InputStream x,
                           int length) throws SQLException;
  
  
    void updateBinaryStream(String columnLabel,
                            java.io.InputStream x,
                            int length) throws SQLException;
  
  
    void updateCharacterStream(String columnLabel,
                               java.io.Reader reader,
                               int length) throws SQLException;
  
  
    void updateObject(String columnLabel, Object x, int scaleOrLength)
      throws SQLException;
  
  
    void updateObject(String columnLabel, Object x) throws SQLException;
  
  
    void insertRow() throws SQLException;
  
  
    void updateRow() throws SQLException;
  
  
    void deleteRow() throws SQLException;
  
  
    void refreshRow() throws SQLException;
  
  
    void cancelRowUpdates() throws SQLException;
  
  
    void moveToInsertRow() throws SQLException;
  
  
    void moveToCurrentRow() throws SQLException;
  
  
    Statement getStatement() throws SQLException;
  
  
    Object getObject(int columnIndex, java.util.Map<String,Class<?>> map)
      throws SQLException;
  
  
    Ref getRef(int columnIndex) throws SQLException;
  
  
    Blob getBlob(int columnIndex) throws SQLException;
  
  
    Clob getClob(int columnIndex) throws SQLException;
  
  
    Array getArray(int columnIndex) throws SQLException;
  
  
    Object getObject(String columnLabel, java.util.Map<String,Class<?>> map)
      throws SQLException;
  
  
    Ref getRef(String columnLabel) throws SQLException;
  
  
    Blob getBlob(String columnLabel) throws SQLException;
  
  
    Clob getClob(String columnLabel) throws SQLException;
  
  
    Array getArray(String columnLabel) throws SQLException;
  
  
    java.sql.Date getDate(int columnIndex, Calendar cal) throws SQLException;
  
  
    java.sql.Date getDate(String columnLabel, Calendar cal) throws SQLException;
  
  
    java.sql.Time getTime(int columnIndex, Calendar cal) throws SQLException;
  
  
    java.sql.Time getTime(String columnLabel, Calendar cal) throws SQLException;
  
  
    java.sql.Timestamp getTimestamp(int columnIndex, Calendar cal)
      throws SQLException;
  
  
    java.sql.Timestamp getTimestamp(String columnLabel, Calendar cal)
      throws SQLException;
  
  
  
    int HOLD_CURSORS_OVER_COMMIT = 1;
  
  
    int CLOSE_CURSORS_AT_COMMIT = 2;
  
  
    java.net.URL getURL(int columnIndex) throws SQLException;
  
  
    java.net.URL getURL(String columnLabel) throws SQLException;
  
  
    void updateRef(int columnIndex, java.sql.Ref x) throws SQLException;
  
  
    void updateRef(String columnLabel, java.sql.Ref x) throws SQLException;
  
  
    void updateBlob(int columnIndex, java.sql.Blob x) throws SQLException;
  
  
    void updateBlob(String columnLabel, java.sql.Blob x) throws SQLException;
  
  
    void updateClob(int columnIndex, java.sql.Clob x) throws SQLException;
  
  
    void updateClob(String columnLabel, java.sql.Clob x) throws SQLException;
  
  
    void updateArray(int columnIndex, java.sql.Array x) throws SQLException;
  
  
    void updateArray(String columnLabel, java.sql.Array x) throws SQLException;
  
    //------------------------- JDBC 4.0 -----------------------------------
  
  
    RowId getRowId(int columnIndex) throws SQLException;
  
  
    RowId getRowId(String columnLabel) throws SQLException;
  
  
    void updateRowId(int columnIndex, RowId x) throws SQLException;
  
  
    void updateRowId(String columnLabel, RowId x) throws SQLException;
  
  
    int getHoldability() throws SQLException;
  
  
    boolean isClosed() throws SQLException;
  
  
    void updateNString(int columnIndex, String nString) throws SQLException;
  
  
    void updateNString(String columnLabel, String nString) throws SQLException;
  
  
    void updateNClob(int columnIndex, NClob nClob) throws SQLException;
  
  
    void updateNClob(String columnLabel, NClob nClob) throws SQLException;
  
  
    NClob getNClob(int columnIndex) throws SQLException;
  
  
    NClob getNClob(String columnLabel) throws SQLException;
  
  
    SQLXML getSQLXML(int columnIndex) throws SQLException;
  
  
    SQLXML getSQLXML(String columnLabel) throws SQLException;
  
    void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException;
  
    void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException;
  
  
    String getNString(int columnIndex) throws SQLException;
  
  
  
    String getNString(String columnLabel) throws SQLException;
  
  
  
    java.io.Reader getNCharacterStream(int columnIndex) throws SQLException;
  
  
    java.io.Reader getNCharacterStream(String columnLabel) throws SQLException;
  
  
    void updateNCharacterStream(int columnIndex,
                                java.io.Reader x,
                                long length) throws SQLException;
  
  
    void updateNCharacterStream(String columnLabel,
                                java.io.Reader reader,
                                long length) throws SQLException;
  
    void updateAsciiStream(int columnIndex,
                           java.io.InputStream x,
                           long length) throws SQLException;
  
  
    void updateBinaryStream(int columnIndex,
                            java.io.InputStream x,
                            long length) throws SQLException;
  
  
    void updateCharacterStream(int columnIndex,
                               java.io.Reader x,
                               long length) throws SQLException;
  
    void updateAsciiStream(String columnLabel,
                           java.io.InputStream x,
                           long length) throws SQLException;
  
  
    void updateBinaryStream(String columnLabel,
                            java.io.InputStream x,
                            long length) throws SQLException;
  
  
    void updateCharacterStream(String columnLabel,
                               java.io.Reader reader,
                               long length) throws SQLException;
  
    void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException;
  
  
    void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException;
  
  
    void updateClob(int columnIndex,  Reader reader, long length) throws SQLException;
  
  
    void updateClob(String columnLabel,  Reader reader, long length) throws SQLException;
  
    void updateNClob(int columnIndex,  Reader reader, long length) throws SQLException;
  
  
    void updateNClob(String columnLabel,  Reader reader, long length) throws SQLException;
  
    //---
  
  
    void updateNCharacterStream(int columnIndex,
                                java.io.Reader x) throws SQLException;
  
  
    void updateNCharacterStream(String columnLabel,
                                java.io.Reader reader) throws SQLException;
  
    void updateAsciiStream(int columnIndex,
                           java.io.InputStream x) throws SQLException;
  
  
    void updateBinaryStream(int columnIndex,
                            java.io.InputStream x) throws SQLException;
  
  
    void updateCharacterStream(int columnIndex,
                               java.io.Reader x) throws SQLException;
  
    void updateAsciiStream(String columnLabel,
                           java.io.InputStream x) throws SQLException;
  
  
    void updateBinaryStream(String columnLabel,
                            java.io.InputStream x) throws SQLException;
  
  
    void updateCharacterStream(String columnLabel,
                               java.io.Reader reader) throws SQLException;
  
    void updateBlob(int columnIndex, InputStream inputStream) throws SQLException;
  
  
    void updateBlob(String columnLabel, InputStream inputStream) throws SQLException;
  
  
    void updateClob(int columnIndex,  Reader reader) throws SQLException;
  
  
    void updateClob(String columnLabel,  Reader reader) throws SQLException;
  
    void updateNClob(int columnIndex,  Reader reader) throws SQLException;
  
  
    void updateNClob(String columnLabel,  Reader reader) throws SQLException;
  
    //------------------------- JDBC 4.1 -----------------------------------
  
  
  
    public <T> T getObject(int columnIndex, Class<T> type) throws SQLException;
  
  
  
    public <T> T getObject(String columnLabel, Class<T> type) throws SQLException;
  
    //------------------------- JDBC 4.2 -----------------------------------
  
  
    default void updateObject(int columnIndex, Object x,
                              SQLType targetSqlType, int scaleOrLength)  throws SQLException {
      throw new SQLFeatureNotSupportedException("updateObject not implemented");
    }
  
    default void updateObject(String columnLabel, Object x,
                              SQLType targetSqlType, int scaleOrLength) throws SQLException {
      throw new SQLFeatureNotSupportedException("updateObject not implemented");
    }
  
  
    default void updateObject(int columnIndex, Object x, SQLType targetSqlType)
      throws SQLException {
      throw new SQLFeatureNotSupportedException("updateObject not implemented");
    }
  
  
    default void updateObject(String columnLabel, Object x,
                              SQLType targetSqlType) throws SQLException {
      throw new SQLFeatureNotSupportedException("updateObject not implemented");
    }
  }
}
