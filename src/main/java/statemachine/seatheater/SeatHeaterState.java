package statemachine.seatheater;

public enum SeatHeaterState {

    OFF {
        @Override
        SeatHeaterState next() {
            return THREE;
        }
    }
    ,ONE {
        @Override
        SeatHeaterState next() {
            return OFF;
        }
    }
    ,TWO {
        @Override
        SeatHeaterState next() {
            return ONE;
        }
    }
    ,THREE {
        @Override
        SeatHeaterState next() {
            return TWO;
        }
    }
    ;

    abstract SeatHeaterState next();
}
