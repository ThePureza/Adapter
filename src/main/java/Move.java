public class Move {

    IMovement movement;
    MovementAdapter persistence;

    public Move() {
        movement = new MovementSquare();
        persistence = new MovementAdapter(movement);
    }
}
