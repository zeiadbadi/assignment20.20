import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileSizeStackTest extends FileSizeStack{
    @Test
    public void getSize() throws Exception {
        long dirSize;
        String myDirectory = "/Users/zeiadbadi/documents";
        File myFiles = new File(myDirectory);

        dirSize = getSize(myFiles);

        assertEquals(180821687, dirSize);
    }

}