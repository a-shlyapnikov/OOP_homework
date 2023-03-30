package HW07.Model.Logger;

import java.io.IOException;

public interface ILog {
    void newLog(String log) throws IOException;
    void end() throws IOException;
}
