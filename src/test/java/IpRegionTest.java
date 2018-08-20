import org.junit.Test;
import org.lionsoul.ip2region.*;

import java.io.FileNotFoundException;

public class IpRegionTest {
    @Test
    public void test1() throws Exception {
        DbSearcher dbSearcher = new DbSearcher(new DbConfig(), this.getClass().getResource("data/ip2region.db").getFile());
        DataBlock dataBlock = dbSearcher.btreeSearch("1.1.1.1");
        System.out.println(dataBlock);
    }
}
