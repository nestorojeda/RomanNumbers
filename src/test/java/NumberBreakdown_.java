import es.ulpgc.NumberBreakdown;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class NumberBreakdown_ {


    private final int number;
    private final int[][] value;

    public NumberBreakdown_(int number, int[][] value) {
        this.number = number;
        this.value = value;
    }

    @Test
    public void execute(){
        assertThat(new NumberBreakdown().decompose(number)).isEqualTo(value);
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {0, new int[][]{}},
                {1, new int[][]{{1,0}}},
                {2, new int[][]{{2,0}}},
                {3, new int[][]{{3,0}}},

                {10, new int[][]{{1,1}}},
                {20, new int[][]{{2,1}}},
                {30, new int[][]{{3,1}}},

                {100, new int[][]{{1,2}}},
                {200, new int[][]{{2,2}}},
                {300, new int[][]{{3,2}}},


                {1000, new int[][]{{1,3}}},
                {2000, new int[][]{{2,3}}},
                {3000, new int[][]{{3,3}}},

                {11, new int[][]{{1,1}, {1, 0}}},
                {21, new int[][]{{2,1}, {1, 0}}},
                {29, new int[][]{{2,1}, {9, 0}}},
                {31, new int[][]{{3,1}, {1, 0}}},
                {39, new int[][]{{3,1}, {9, 0}}},

                {110, new int[][]{{1,2}, {1, 1}}},
                {101, new int[][]{{1,2}, {1,0}}}



        };
    }
}
