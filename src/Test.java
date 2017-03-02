public class Test {

	public static void main(String[] args) {
		
		System.out.println("fdasfda"+"123213");
		//deploypress();
		//undeploypress();
		/*String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ykhl";
		String username = "root";
		String password = "root";
		try
		{
		Class.forName(driver);//加载驱动程序，此处运用隐式注册驱动程序的方法
		Connection con = DriverManager.getConnection(url,username,password);//创建连接对象
		for(int  i = 0;i < 100;i++){
			int num = i;
			new Thread(){
				public void run(){
					try {
						PreparedStatement pstmt;
						String sql = "insert into test values(?,?)";
						pstmt = con.prepareStatement(sql);
				        pstmt.setString(1,Integer.toString(num));
				        pstmt.setString(2,Integer.toString(num));
						System.out.println(pstmt.execute());
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}.start();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	
	public static void deploypress(){
		System.out.println("deploypress 开始");
		//一些处理.....
		//=====A线程处理
		Thread A = new Thread(){
				public void run() {
					System.out.println("A线程处理........");
				}
		};
		A.start();
		try {
			A.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A线程处理结束");
		//=====A线程处理结束
		System.out.println("deploypress 结束");
	}
	
	public static void undeploypress(){
		System.out.println("deploypress 开始");
		//一些处理.....
		//=====B线程处理
		Thread B = new Thread(){
			public void run() {
				System.out.println("B线程处理........");
			}
		};
		B.start();
		try {
			B.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("B线程处理结束");
		//=====B线程处理结束
		System.out.println("deploypress 结束");
	}
	
}
