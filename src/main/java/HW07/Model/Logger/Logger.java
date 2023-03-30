package HW07.Model.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger implements ILog {

    private static final String PATH = "C:\\Users\\Александр\\Desktop\\GB\\Программист I четверть\\ООП\\HomeWork\\src\\main\\java\\HW07\\log.txt";

    private BufferedWriter bw;

    public Logger() {
        try {
            this.bw = new BufferedWriter(new FileWriter(PATH, true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void newLog(String log) throws IOException {
        bw.write(log);
        bw.flush();
    }

    @Override
    public void end() throws IOException {
        bw.close();
    }
}
