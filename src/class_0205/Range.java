package class_0205;

public class Range {
	int begin;
	int end;
	
	public Range(int begin, int end) {
		this.begin = begin;
		this.end = end;
	}

	boolean OverlapsWith(Range r){
//		[0,2]가 [2,4]와 겹치는 것으로 계산
//		return (begin >= r.begin && begin <= r.end) || 
//			   (end   >= r.begin && end   <= r.end);

//		begin/end가 r에 완전히 포함되는 경우가 계산되지 않음
//		return (begin >= r.begin && begin <  r.end) || 
//			   (end   >  r.begin && end   <= r.end);

		
		return (begin >= r.begin  && begin <  r.end) || 
			   (end   >  r.begin  && end   <= r.end) ||
			   (end   <= r.begin  && end   >= r.end);

	}
	
	public static void main(String[] args) {
		Range a = new Range(1, 3);
		Range b = new Range(3, 6);
		Range c = new Range(6, 8);
		Range d = new Range(2, 8);
		
		System.out.println(a.OverlapsWith(b)); //f
		System.out.println(a.OverlapsWith(c)); //f
		System.out.println(a.OverlapsWith(d)); //t
		System.out.println();
		
		System.out.println(b.OverlapsWith(a)); //f
		System.out.println(b.OverlapsWith(c)); //f
		System.out.println(b.OverlapsWith(d)); //t
		System.out.println();
		
		System.out.println(c.OverlapsWith(b)); //f
		System.out.println(c.OverlapsWith(a)); //f
		System.out.println(c.OverlapsWith(d)); //t
		System.out.println();
		
		System.out.println(d.OverlapsWith(b)); //t
		System.out.println(d.OverlapsWith(c)); //t
		System.out.println(d.OverlapsWith(a)); //t
		
	}
	
}
