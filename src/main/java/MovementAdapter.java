public class MovementAdapter extends IMovement{
    private IMovement movement;

    public MovementAdapter(IMovement movement) {
        this.movement = movement;
    }

    public String recoverMovement() {
        Integer square;

        square = this.getMeter() / 1.5f;
        movement.setMovement(square);
        
        return movement.getMovement();
    }

    public void saveMovement() {
        float meter;

        meter = movement.getMovement() * 1.5f;
        this.setMeter(meter);
    }
}
