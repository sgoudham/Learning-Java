package adapter.animal.tests;

import adapter.animal.Bird;
import adapter.animal.BirdAdapter;
import adapter.animal.Sparrow;
import adapter.animal.ToyDuck;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class BirdAdapterTest {

    @Test
    void verifyMakeSoundIsCalled() {
        Bird mockedSparrow = mock(Sparrow.class);
        ToyDuck birdAdapter = new BirdAdapter(mockedSparrow);

        birdAdapter.squeak();
        verify(mockedSparrow, times(1)).makeSound();
    }
}