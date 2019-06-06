package Threading;

class ThreadPro implements Runnable{  
	@Override
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
	    //get current name
	    System.out.println(i + Thread.currentThread().getName());  
	  }  
	 }  
	 public static void main(String args[]) throws InterruptedException{  
		 ThreadPro t1=new ThreadPro();  
		 Thread t2=new Thread("ppm");  
		 ThreadPro t3=new ThreadPro();  
		 ThreadPro t4=new ThreadPro();  
		 
//		 t1.start();
//		 t1.setName("babyma");
		 
		 t2.start();
//		 t2.join(); 
//		 t3.start();
//		 t4.start();
//		 
		 
		  
	 }  
	}  