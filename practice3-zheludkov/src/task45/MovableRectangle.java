package task45;

public class MovableRectangle implements  Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    public Boolean checkSpeed(){
        if((topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed))
            return true;
        else
            return false;
    }

    @Override
    public void moveUp() {
        if(checkSpeed())
        {
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }
        else
            System.out.println("Point have different speed");
    }
    @Override
    public void moveDown() {
        if(checkSpeed())
        {
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }
        else
            System.out.println("Point have different speed");
    }
    @Override
    public void moveLeft() {
        if(checkSpeed())
        {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
        else
            System.out.println("Point have different speed");
    }

    @Override
    public void moveRight() {
        if(checkSpeed())
        {
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }
        else
            System.out.println("Point have different speed");
    }
}
