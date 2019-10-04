import es.ulpgc.NumberBreakdown;
import org.junit.Test;

import static es.ulpgc.TuppleMapper.tuppleMapper;
import static org.assertj.core.api.Assertions.assertThat;


public class TuppleMapper_ {

    @Test
    public void should_return_I(){
        assertThat(tuppleMapper(new NumberBreakdown(1).breakdown())).isEqualTo("I");
    }

    @Test
    public void should_return_II(){
        assertThat(tuppleMapper(new NumberBreakdown(2).breakdown())).isEqualTo("II");
    }

    @Test
    public void should_return_X(){
        assertThat(tuppleMapper(new NumberBreakdown(10).breakdown())).isEqualTo("X");
    }

    @Test
    public void should_return_XI(){
        assertThat(tuppleMapper(new NumberBreakdown(11).breakdown())).isEqualTo("XI");
    }

    @Test
    public void should_return_MMMCMXCIX(){
        assertThat(tuppleMapper(new NumberBreakdown(3999).breakdown())).isEqualTo("MMMCMXCIX");
    }

}
