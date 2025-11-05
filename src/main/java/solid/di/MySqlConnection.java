package solid.di;

public class MySqlConnection implements DBConnection {
    @Override
    public void connection() {
        // MySQL specific connection code
    }

    @Override
    public void close() {
        // MySQL specific close code
    }
}
