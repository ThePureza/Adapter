public class MovementSquare implements IMovement{

    private Integer movement;

    @Override
    public Integer getMovement() {
        return this.movement;
    }

    @Override
    public void setMovement(Integer movement) {
        this.movement = movement;
    }
}
