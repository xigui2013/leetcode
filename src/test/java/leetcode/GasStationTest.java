package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * GasStation Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 16, 2017</pre>
 */
public class GasStationTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: canCompleteCircuit(int[] gas, int[] cost)
     */
    @Test
    public void testCanCompleteCircuit() throws Exception {
        GasStation gasStation = new GasStation();
        int[] gas = {2, 4};
        int[] cost = {3, 4};
        assertEquals(-1, gasStation.canCompleteCircuit(gas, cost));
        int[] gas1 = {1, 2};
        int[] cost1 = {2, 1};
        assertEquals(1, gasStation.canCompleteCircuit(gas1, cost1));
        int[] gas2 = {2, 0, 1, 2, 3, 4, 0};
        int[] cost2 = {0, 1, 0, 0, 0, 0, 11};
        assertEquals(0, gasStation.canCompleteCircuit(gas2, cost2));
    }


    }
