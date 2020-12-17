package state.atm.with.singleton.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import state.atm.with.singleton.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertSame;

class ATMMachineTest {

    private static ATMMachine atmMachine;

    @BeforeAll
    static void setup() {
        atmMachine = new ATMMachine();
    }

    @Test
    void testATMMachineStartsInReadyState() {
        assertSame(atmMachine.getAtmState(), NoCard.getInstance(atmMachine));
    }

    @Test
    void testATMMachinesStatesAreSingletons() {
        ATMState noCard = NoCard.getInstance(atmMachine);
        ATMState hasCard = HasCard.getInstance(atmMachine);
        ATMState hasPin = HasPin.getInstance(atmMachine);
        ATMState noCash = NoCash.getInstance(atmMachine);

        ATMState noCardv2 = NoCard.getInstance(atmMachine);
        ATMState hasCardv2 = HasCard.getInstance(atmMachine);
        ATMState hasPinv2 = HasPin.getInstance(atmMachine);
        ATMState noCashv2 = NoCash.getInstance(atmMachine);

        assertAll("All ATMStates Should Be Singletons",
                () -> assertSame(noCard, noCardv2),
                () -> assertSame(hasCard, hasCardv2),
                () -> assertSame(hasPin, hasPinv2),
                () -> assertSame(noCash, noCashv2)
        );
    }
}