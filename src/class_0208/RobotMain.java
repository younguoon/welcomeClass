package class_0208;

public class RobotMain {

	public static void main(String[] args) {
		Robot robot = new Robot("Android");
		
		robot.dorder(Robot.Command.WALK );
		robot.dorder(Robot.Command.STOP);
		robot.dorder(Robot.Command.JUMP);
		
		//분류코드 클래스로 등록하면, 직접사용하면 오류가 남
//		robot.dorder(0);
//		robot.dorder(1);
//		robot.dorder(2);
		
	}
}

