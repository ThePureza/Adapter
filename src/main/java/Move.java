public class Move {

    IMovement movement;
    MovementAdapter adapter;

    public Move(IMovement movement) {
        this.movement = movement;
        this.adapter = new MovementAdapter(movement);
    }

    public void setMovement(Integer movement) {
        movement.setMovement(movement);
        adapter.saveMovement();
    }

    public Integer getMovement() {
        return adapter.recoverMovement();
    }

    public float getMeter() {
        return adapter.getMeter();
    }
}
