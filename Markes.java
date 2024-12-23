package keshav;

	import java.util.Random;

	class MyStudent{
		int id;
		String name;
		int sub1;
		int sub2;
		int sub3;
		int fee;
		String college = "Stpeter College";
		int maxFee = 75000;

		public MyStudent(int id, String name, int sub1, int sub2, int sub3, int fee) {
			super();
			this.id = id;
			this.name = name;
			this.sub1 = sub1;
			this.sub2 = sub2;
			this.sub3 = sub3;
			this.fee = fee;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
					+ ", fee=" + fee + ", college=" + college + ", maxFee=" + maxFee + "]";
		}

	}

	public class Markes {

		static int getRandom(int min, int max) {

			Random r = new Random();
			int result = r.nextInt(max - min) + min;
			return result;

		}

		public static void main(String[] args) {

			MyStudent[] stu = new MyStudent[500];
			for (int i = 0; i < 500; i++) {
				stu[i] = new MyStudent(getRandom(50, 7890), "Student" + i, getRandom(0, 100), getRandom(10, 90),
						getRandom(23, 65), getRandom(5000, 67000));

			}

			for (int i = 0; i < 500; i++) {
				System.out.println(stu[i]);
			}
			
			int tot = totalPassStudents(stu);
			System.out.println("all pass students no--->"+tot);
			
			
			

		}

		private static int totalPassStudents(MyStudent[] stu) {
			// TODO Auto-generated method stub
			return 0;
		}

		private static int totalPassStudents(Student[] stu) {
			int count=0;
			for(int i=0;i<stu.length;i++) {
				if ( (stu[i].sub1 > 35) &&
						(stu[i].sub2 > 35) &&
						(stu[i].sub3 > 35)
					) {
					count++;
				}
			}
			
			
			
			return count;
		}

	}

