package kata.clash;


import kata.clash.buildings.BlackElixirFactory;
import kata.clash.exceptions.DwarfsAngryException;
import kata.clash.exceptions.InvalidQuantityException;
import org.junit.Assert;
import org.junit.Test;

public class Ex1 {
    @Test
    public void When_Gems_Supplied_Are_Not_Enough_Throw_DwarfsAngryException() throws Exception {

        boolean hasException = false;
        try {
            BlackElixirFactory.ProduceElixir(1, 100);
        } catch (DwarfsAngryException exc) {
            hasException = true;
        }

        Assert.assertTrue(hasException);

    }

    @Test
    public void When_BlueElixir_Supplied_Is_Not_Enough_Throw_DwarfsAngryException() throws Exception {
        boolean hasException = false;
        try {
            BlackElixirFactory.ProduceElixir(2, 100);
        } catch (DwarfsAngryException exc) {
            hasException = true;
        }

        Assert.assertTrue(hasException);
    }

    @Test
    public void With_2_Gems_And_500_BlueElixir_Should_Produce_100_BlackElixir() throws Exception {

        int result = BlackElixirFactory.ProduceElixir(2, 500);
        Assert.assertEquals(100, result);
    }

    @Test
    public void With_4_Gems_And_1000_BlueElixir_Should_Produce_200_BlackElixir() throws Exception {
        int result = BlackElixirFactory.ProduceElixir(4, 1000);
        Assert.assertEquals(200, result);
    }

    @Test
    public void With_5_Gems_And_200_BlueElixir_Should_Produce_100_BlackElixir() throws Exception {
        int result = BlackElixirFactory.ProduceElixir(5, 200);
        Assert.assertEquals(100, result);
    }

    @Test
    public void When_Gem_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception {
        boolean hasException = false;
        try {
            BlackElixirFactory.ProduceElixir(5, 201);
        } catch (InvalidQuantityException exc) {
            hasException = true;
        }

        Assert.assertTrue(hasException);
    }

    @Test
    public void When_Blue_Elixir_Supplied_Is_Too_Much_Throw_InvalidQuantityException() throws Exception {
        boolean hasException = false;
        try {
            BlackElixirFactory.ProduceElixir(40, 1000);
        } catch (InvalidQuantityException exc) {
            hasException = true;
        }

        Assert.assertTrue(hasException);
    }


}
