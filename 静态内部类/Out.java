package 静态内部类;

class Out {
	class In {
		public In(String msg) {
			System.out.println(msg);
		}
	}
}
class OutTest {
	public static void main(String[] args) {
		Out.In in = new Out().new In("巴拉巴拉");
		/*上面的代码等价于下面三行
		 * 使用OuttterClass.InnerClass的形式定义内部类变量
		 * Out.In in1;
		 * 创建外部类实例,非静态内部类的实例将寄存在该实例中
		 * Out out = new Out();
		 * 通过外部类实例和new来调用内部类构造器创建非静态内部类的实例
		 * in1 = out.new In("测试");
		 */
		
	}
}
