package keshav;
	import java.util.Random;

	class MStudent {
		int id;
		String name;
		int sub1;
		int sub2;
		int sub3;
		int fee;
		String college = "Stpeter College";
		int maxFee = 75000;

		public MStudent(int id, String name, int sub1, int sub2, int sub3, int fee) {
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

	public class Free {

		static int getRandom(int min, int max) {

			Random r = new Random();
			int result = r.nextInt(max - min) + min;
			return result;

		}

		public static void main(String[] args) {

			MStudent[] stu = new MStudent[500];
			for (int i = 0; i < 500; i++) {
				stu[i] = new MStudent(getRandom(50, 7890), "Student" + i, getRandom(0, 100), getRandom(10, 90),
						getRandom(23, 65), getRandom(5000, 67000));

			}

			for (int i = 0; i < 500; i++) {
				System.out.println(stu[i]);
			}
			
			int tot = totalPassStudents(stu);
			System.out.println("all pass students no--->"+tot);
			int graceTot = getGraceTotalStu(stu);
			System.out.println("all grace marks students no--->"+graceTot);
			
			
		}

		private static int getGraceTotalStu(MStudent[] stu) {
			int count=0;
			for(int i=0;i<stu.length;i++) {
				if ( ((stu[i].sub1 > 30) && (stu[i].sub1 < 35) )
						||
						((stu[i].sub2 > 30) && (stu[i].sub2 < 35))
						||
						((stu[i].sub3 > 30) && (stu[i].sub3 < 35)) 
						) {
					System.out.println(stu[i]);
					count++;
				}
			}
			
			
			
			return count;}

		private static int totalPassStudents(MStudent[] stu) {
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

