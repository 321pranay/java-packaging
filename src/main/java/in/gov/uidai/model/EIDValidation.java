package in.gov.uidai.model;

import java.sql.Connection;
import java.sql.SQLException;

public interface EIDValidation {

    // requires db for validation
    boolean IsFirstHalfValid(String EID_FirstHalf, Connection connection) throws SQLException, ClassNotFoundException;

    // this is timestamp validation, so no db is required
    boolean IsSecondHalfValid(String EID_SecondHalf);

}
