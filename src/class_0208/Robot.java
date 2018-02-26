package class_0208;

/**

package class_0208;
매직 넘버를 기호화된 상수로 치환

매직 넘버 소스코드에 특정한 의미를 나타내는 숫자

1. 매직 넘버를 기호 상수로 치환
2. 분류 코드를 클래스로 치환
3. 열거형(enum)으로 기호상수를 표현

**/


public class Robot {
//	public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
//	public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
//	public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
	public String name;
	
	// 가질 수 있는 상수
 	public enum Command{
		WALK, STOP, JUMP
	}
	
	public Robot(String name){
		this.name = name;
	}
	
	public void dorder(Robot.Command command){
		if(command == Robot.Command.WALK){
			System.out.println(name + " walks");
		}else if(command == Robot.Command.STOP){
			System.out.println(name + " stops");
		}else if(command==Robot.Command.JUMP){
			System.out.println(name + " jumps");
		}else{
			System.out.println("error  "+command + "  is invalid");
		}
	}
}
