import java.util.*;

class StudentManagementSystem {
    // Batch status
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    // Batch data
    public static int[] batchNameArray = { 105, 106, 107, 108, 109, 110 };
    public static int[] batchStatusArray = { 0, 0, 0, 0, 1, 1 };

    // Student data
    public static String[] regNoArray = {
            "PR24105001", "PR24105002", "PR24105003", "PR24105004", "PR24105005",
            "PR24105006", "PR24105007", "PR24105008", "PR24105009", "PR24105010",
            "OR24105011", "OR24105012", "OR24105013", "OR24105014", "OR24105015",
            "PR24105016", "PR24105017", "PR24105018", "OR24105019", "OR24105020",
            "PR24105021", "PR24105022", "OR24105023", "OR24105024", "PR24105025",
            "PR24106001", "PR24106002", "PR24106003", "PR24106004", "PR24106005",
            "PR24106006", "PR24106007", "PR24106008", "PR24106009", "PR24106010",
            "OR24106011", "OR24106012", "OR24106013", "OR24106014", "OR24106015",
            "PR24106016", "PR24106017", "PR24106018", "OR24106019", "OR24106020",
            "PR24106021", "PR24106022", "OR24106023", "OR24106024", "PR24106025",
            "PR24107001", "PR24107002", "PR24107003", "PR24107004", "PR24107005",
            "PR24107006", "PR24107007", "PR24107008", "PR24107009", "PR24107010",
            "OR24107011", "OR24107012", "OR24107013", "OR24107014", "OR24107015",
            "PR24107016", "PR24107017", "PR24107018", "OR24107019", "OR24107020",
            "PR24107021", "PR24107022", "OR24107023", "OR24107024", "PR24107025",
            "PR24108001", "PR24108002", "PR24108003", "PR24108004", "PR24108005",
            "PR24108006", "PR24108007", "PR24108008", "PR24108009", "PR24108010",
            "OR24108011", "OR24108012", "OR24108013", "OR24108014", "OR24108015",
            "PR24108016", "PR24108017", "PR24108018", "OR24108019", "OR24108020",
            "PR24108021", "PR24108022", "OR24108023", "OR24108024", "PR24108025",
            "PR24109001", "PR24109002", "PR24109003", "PR24109004", "PR24109005",
            "PR24109006", "PR24109007", "PR24109008", "PR24109009", "PR24109010",
            "OR24109011", "OR24109012", "OR24109013", "OR24109014", "OR24109015",
            "PR24109016", "PR24109017", "PR24109018", "OR24109019", "OR24109020",
            "PR24109021", "PR24109022", "OR24109023", "OR24109024", "PR24109025",
            "PR24110001", "PR24110002", "PR24110003", "PR24110004", "PR24110005",
            "PR24110006", "PR24110007", "PR24110008", "PR24110009", "PR24110010",
            "OR24110011", "OR24110012", "OR24110013", "OR24110014", "OR24110015",
            "PR24110016", "PR24110017", "PR24110018", "OR24110019", "OR24110020",
            "PR24110021", "PR24110022", "OR24110023", "OR24110024", "PR24110025"

    };

    public static String[] nicArray = {
            "199501012345", "199503153872", "199506202198", "199509102983", "199511258739",
            "199512303498", "199502183764", "199504223198", "199508153210", "199510293417",
            "199601102375", "199604182938", "199606243879", "199608142178", "199610312475",
            "199611173452", "199603293481", "199605083217", "199607232198", "199609192375",
            "199701212483", "199703132487", "199706253478", "199708083298", "199710243651",
            "199712152983", "199702182734", "199704293187", "199705142375", "199709083751",
            "199801032874", "199803232871", "199806193428", "199808013764", "199810242374",
            "199812302984", "199802152348", "199805213471", "199807172398", "199811283472",
            "199901122471", "199903052984", "199906213874", "199908093412", "199910273894",
            "199912153482", "199902202394", "199904163874", "199907293481", "199911083479",
            "200001112374", "200003143478", "200006293874", "200008103471", "200010252984",
            "200012043894", "200002193874", "200004212374", "200005183492", "200007153871",
            "200101232984", "200103083471", "200106273894", "200108123984", "200110043728",
            "200112213874", "200102253471", "200104103874", "200105293784", "200107202983",
            "200201013874", "200203253471", "200206143874", "200208083471", "200210293874",
            "200212183471", "200202103874", "200204123894", "200205283471", "200207153874",
            "200301093874", "200303283471", "200306153874", "200308123471", "200310083874",
            "200312243471", "200302273874", "200304203471", "200305123874", "200307213471",
            "200401153874", "200403123471", "200406293874", "200408083471", "200410213874",
            "200412153471", "200402203874", "200404273471", "200405143874", "200407183471",
            "200501023874", "200503193471", "200506153874", "200508213471", "200510083874",
            "200512293471", "200502123874", "200504153471", "200505283874", "200507173471"
            ,"200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678"
        };

    public static String[] nameArray = {
            "Gunawardena Weerasinghe", "Senanayake Silva", "Silva Kumara", "Kumara Herath", "Rathnayake Herath",
            "Wijesinghe Bandara", "Rajapaksha Herath", "Senanayake Karunaratne", "Karunaratne Jayasinghe",
            "Gunawardena Silva",
            "Weerasinghe Rajapaksha", "Silva Rathnayake", "Fernando Perera", "Kumara Abeysekera",
            "Ekanayake Rathnayake",
            "Herath Gunawardena", "Abeysekera Silva", "Weerasinghe Silva", "Jayasinghe Dias", "Bandara Rathnayake",
            "Silva Perera", "De Silva Dias", "Abeysekera Jayasinghe", "Rajapaksha Senanayake", "Kumara Karunaratne",
            "Silva Abeysekera", "Jayasinghe Bandara", "Rathnayake Kumara", "Weerasinghe Rajapaksha",
            "Senanayake Herath",
            "Perera Ekanayake", "Herath Jayasinghe", "Kumara Gunawardena", "Abeysekera Silva", "Dias Fernando",
            "Karunaratne Weerasinghe", "Ekanayake Bandara", "Rajapaksha Kumara", "Silva De Silva",
            "Gunawardena Rathnayake",
            "Bandara Karunaratne", "Fernando Perera", "De Silva Silva", "Rajapaksha Gunawardena", "Herath Weerasinghe",
            "Karunaratne Dias", "Jayasinghe Silva", "Senanayake Abeysekera", "Silva Jayasinghe", "Rathnayake Kumara",
            "Gunawardena Kumara", "Rajapaksha Silva", "Perera Jayasinghe", "Silva Ekanayake", "Dias Senanayake",
            "Herath Abeysekera", "Rathnayake Fernando", "Kumara Herath", "Weerasinghe Silva", "Senanayake Karunaratne",
            "Abeysekera Silva", "Bandara Gunawardena", "Karunaratne Weerasinghe", "Perera Herath", "Fernando Dias",
            "Weerasinghe Gunawardena", "Rathnayake Kumara", "Senanayake Fernando", "Silva Bandara", "Herath Rajapaksha",
            "Kumara Jayasinghe", "Abeysekera Perera", "Rathnayake Jayasinghe", "Kumara Weerasinghe",
            "Rajapaksha Ekanayake",
            "Fernando Rajapaksha", "Silva Gunawardena", "Perera Wijesinghe", "Herath Abeysekera",
            "Rajapaksha Ekanayake",
            "Karunaratne Silva", "Weerasinghe Fernando", "Silva Bandara", "Abeysekera Weerasinghe",
            "Kumara Karunaratne",
            "Dias Rajapaksha", "Herath Perera", "Rathnayake Gunawardena", "Ekanayake Jayasinghe", "Gunawardena Silva",
            "Rajapaksha Perera", "Karunaratne Jayasinghe", "Weerasinghe Abeysekera", "Rathnayake Fernando",
            "Kumara Herath",
            "Silva Weerasinghe", "Herath Karunaratne", "Abeysekera Silva", "Gunawardena Ekanayake",
            "Weerasinghe Kumara",
            "Weerasinghe Kumara", "Rajapaksha Abeysekera", "Gunawardena Perera", "Karunaratne Silva",
            "Herath Wijesinghe",
            "Rathnayake Ekanayake", "Silva Fernando", "Abeysekera Rajapaksha", "Fernando Bandara", "Perera Herath",
            "Weerasinghe Jayasinghe", "Silva Karunaratne", "Rathnayake Gunawardena", "Herath Kumara",
            "Abeysekera Silva",
            "Ekanayake Bandara", "Rajapaksha Fernando", "Gunawardena Weerasinghe", "Kumara Karunaratne", "Silva Dias",
            "Perera Weerasinghe", "Karunaratne Rajapaksha", "Jayasinghe Silva", "Rathnayake Perera", "Silva Ekanayake",
            "Silva Karunaratne", "Herath Fernando", "Kumara Jayasinghe", "Weerasinghe Perera", "Abeysekera Rajapaksha",
            "Rathnayake Karunaratne", "Ekanayake Bandara", "Gunawardena Perera", "Silva Wijesinghe",
            "Rajapaksha Jayasinghe",
            "Rathnayake Fernando", "Karunaratne Kumara", "Perera Silva", "Gunawardena Ekanayake", "Bandara Rajapaksha",
            "Silva Herath", "Rathnayake Weerasinghe", "Perera Gunawardena", "Herath Karunaratne", "Silva Rajapaksha",
            "Ekanayake Kumara", "Bandara Herath", "Weerasinghe Rajapaksha", "Karunaratne Abeysekera", "Perera Dias",

    };

    public static int[] prfArray = {
            85, 39, -1, 72, 44,
            91, 60, 38, 95, 49,
            -1, 67, 23, 58, 88,
            81, 73, 29, 62, -1,
            79, 53, 94, 47, 35,
            93, 15, -1, 82, 45,
            88, 23, 79, 37, -1,
            68, 100, 59, 29, 92,
            12, 77, 38, 66, 9,
            84, 51, 32, -1, 97,
            95, -1, 63, 88, 32,
            76, 97, 54, -1, 23,
            90, 35, 81, 61, 44,
            67, 100, 17, 85, 29,
            70, 42, -1, 60, 86,
            86, 57, 91, 35, -1,
            76, 48, 94, 23, 69,
            -1, 80, 55, 88, 32,
            100, 67, 43, -1, 90,
            60, 77, 25, 71, 84,
            92, 68, 59, 85, 63,
            76, 91, 70, 84, 63,
            72, 89, 45, 81, 77,
            68, 63, 88, 75, 90,
            57, 79, 92, 62, 100,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2

    };

    public static int[] dbmsArray = {
            66, 45, 93, 58, -1,
            37, 88, 21, 79, 40,
            76, 54, -1, 69, 92,
            25, 84, 33, 60, 71,
            59, -1, 98, 27, 48,
            35, 91, 60, -1, 72,
            49, 26, 80, 14, 89,
            67, -1, 31, 94, 53,
            78, 5, 90, 24, 86,
            39, -1, 61, 73, 100,
            38, 91, -1, 74, 55,
            82, 66, 49, 99, 13,
            80, 70, 93, 36, 59,
            85, 47, 90, -1, 22,
            77, 34, 63, 100, 29,
            79, 62, 87, -1, 54,
            46, 99, 39, 70, -1,
            75, 83, 58, 92, 30,
            91, 40, 63, 95, 68,
            -1, 66, 21, 88, 37,
            67, 91, 85, 73, 70,
            63, 76, 88, 55, 64,
            79, 80, 59, 92, 68,
            100, 77, 83, 45, 62,
            66, 59, 78, 85, 56,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2
    };

    public static String[] sortedRegNoArray = new String[regNoArray.length];
    public static String[] sortedNicArray = new String[regNoArray.length];
    public static String[] sortedNameArray = new String[regNoArray.length];
    public static int[] sortedPrfArray = new int[regNoArray.length];
    public static int[] sortedDbmsArray = new int[regNoArray.length];
    

    // console clear
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

     // Exit
    public static void exit() {
        clearConsole();
        System.out.println("\n\t\tYou left the program...\n");
        System.exit(0);
    }


    // home page
    public static void homePage() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tiCET Student Management System\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Student Management");
        System.out.println("\n[2] Batch Management ");
        System.out.println("\n[3] Grade Management");
        System.out.println("\n[4] Report Generator");
        System.out.println("\n[5] Exit");

        Scanner input = new Scanner(System.in);
        do {

            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    studentManagement();
                    break;
                case 2:
                    clearConsole();
                    batchManagement();
                    break;
                case 3:
                    clearConsole();
                    gradeManagement();
                    break;
                case 4:
                    clearConsole();
                    reportGenerator();
                    break;
                case 5:
                    exit();
                    break;
            }
        } while (true);
    }
    //addRecord(nicNum,stuName,newRegNo);
    public static void addRecord(String nicNum, String stuName, String newRegNo){
		String[] tempRegNoArray = new String[regNoArray.length+1];
		String[] tempNicArray = new String[nicArray.length+1];
		String[] tempNameArray = new String[nameArray.length+1];
		int[] tempPrfArray = new int[prfArray.length+1];
		int[] tempDbmsArray = new int[dbmsArray.length+1];
		
		for (int i = 0; i < regNoArray.length ; i++){
			tempRegNoArray[i] = regNoArray[i];
			tempNicArray[i] = nicArray[i];
			tempNameArray[i] = nameArray[i];
			tempPrfArray[i] = prfArray[i];
			tempDbmsArray[i] = dbmsArray[i];
		}
		tempRegNoArray[tempRegNoArray.length-1] = newRegNo;
		tempNicArray[tempNicArray.length-1] = nicNum;
		tempNameArray[tempNameArray.length-1] = stuName;
		tempPrfArray[tempPrfArray.length-1] = -2;
		tempDbmsArray[tempDbmsArray.length-1] = -2;
		
		regNoArray = tempRegNoArray;
		nicArray = tempNicArray;
		nameArray = tempNameArray;
		prfArray = tempPrfArray;
		dbmsArray = tempDbmsArray;
		
		sortedRegNoArray= tempRegNoArray;
		sortedNicArray = tempNicArray;
		sortedNameArray = tempNameArray;
		sortedPrfArray = tempPrfArray;
		sortedDbmsArray = tempDbmsArray;
		
	}
	public static String findBatchLastNum(int batchNum){
		int count= 0;
		String newBatchNo = batchNum +"";
		for (int i = 0; i <regNoArray.length ; i++){
			if(newBatchNo.equals(regNoArray[i].substring(4,7))){
				count++;
			}
		}
		String output = String.format("%03d",(count+1));
		return output;
		
	}
	//generate the Register no
    public static String generateRegNo(int regNo,int batchNnum){
		String count = findBatchLastNum(batchNnum);
		String registrationNo = " ";
		if(regNo == 1){//pr
			registrationNo = "PR24"+batchNnum+count;// The student number should be generated here from the regNoArray
		}else if(regNo == 0){//or
			registrationNo = "OR24"+batchNnum+count;// The student number should be generated here from the regNoArray
		}else{
			System.out.println("Invalid input...");
			registrationNo = " ";
		}
		return registrationNo;
	}
    //Search the batch array to see if its there
    public static int checkBatch(int batchNum){
		for (int i = 0; i < batchNameArray.length; i++){
			if(batchNameArray[i] == batchNum){
				return i;
			}
		}
		return -1;
		
	}
	//check if you can enroll to this batch
	public static boolean checkEnroll(int index){
		if(index != -1){
			if(batchStatusArray[index] == ENROLLMENTCLOSED){
				return false;
			}
		}
		
		return true;
	}
	//Search the registernum index
	public static int checkRegNoIndex(String regNum){
		for (int i = 0; i < regNoArray.length; i++){
			if(regNoArray[i].equals(regNum)){
				return i;
			}
		}
		return -1;
	}
	//Check if the nic already exist
	public static boolean checkNic(String nicNum){
		for (int i = 0; i < nicArray.length; i++){
			if(nicArray[i].equals(nicNum)){
				return true;
			}
		}
		return false;
		
	}
    //student management - add student
	public static void addStudent(){
		System.out.println("--------------------------------------------------------------");
		System.out.println("|                         AddStudent                         |");
		System.out.println("--------------------------------------------------------------");
		boolean runtime;
		do{
			runtime = true;
			Scanner input = new Scanner(System.in);
			System.out.print("\nEnter Batch Number (Students Should Be Added): ");
			int batchNum = input.nextInt();	
			int index = checkBatch(batchNum);
			boolean canEnroll = checkEnroll(index);
			if(index == -1){
				System.out.println("This batch doesnt exist");
				
				System.out.print("\nDo you want to add student to another batch (Y/N): ");
				String reAddStudent = input.next();
				if (reAddStudent.equals("n")){
					runtime=false;
				}else{
					clearConsole();
					addStudent();
				}
			}
			//Check if they can enroll to this batch
			if(canEnroll != true){
				System.out.println("\t Students cannot be added to this batch because the enrollment is closed.");
				
				System.out.print("\nDo you want to add student to another batch (Y/N): ");
				String reAddStudent = input.next();
				if (reAddStudent.equals("n")){
					runtime=false;
				}else{
					clearConsole();
					addStudent();
				}
			}
			System.out.print("\nEnter Student NIC: ");
			String nicNum = input.next();	
			//Check if the student already exist
			boolean isExist = checkNic(nicNum);
			if(isExist){
				System.out.println("\tThis student was already added to the system.");
				System.out.print("\nDo you want to add student to another batch (Y/N): ");
				String reAddStudent = input.next();
				if (reAddStudent.equals("n")){
					runtime=false;
				}else{
					clearConsole();
					addStudent();
				}
			}
			System.out.print("\nEnter Student Name: ");
			input.nextLine();
			String stuName = input.nextLine();
			
			System.out.print("\nEnter Lecturer Mode(1-PHYSICAL,0-ONLINE ): ");
			int regNo = input.nextInt();
			String newRegNo = generateRegNo(regNo,batchNum);
			System.out.println("\tStudent Register No-" + newRegNo);
			
			addRecord(nicNum,stuName,newRegNo);
			System.out.println("Student was successfully added to the system.");
			System.out.print("\nDo you want to add student to another batch (Y/N): ");
			String reAddStudent = input.next();
			if (reAddStudent.equals("n")){
				runtime=false;
			}else{
				clearConsole();
				addStudent();
			}
			
			
		}while(runtime);
		clearConsole();
		homePage();
		
		
		
	}
	//Update Student Name
	public static boolean studentNameUpdate(int index){
		boolean runtime = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Student Name Update");
		System.out.println("===================");
		
		System.out.println("Registration Number  : "+regNoArray[index]);
		System.out.println("Student NIC          : "+nicArray[index]);
		System.out.println("Student Current Name : "+nameArray[index]);
		

		System.out.print("\nEnter Student Name  To Update - ");
		String studentName = input.nextLine();
		nameArray[index] = studentName;
		System.out.println("\tStudent name updated successfully...");
		System.out.print("Do you want to update another student details? (y/n): ");
		String choice = input.next();
		if(choice.equals("n")){
			runtime = false;
		} 
		return runtime;
		
	}
	// Update Student NIC
	public static boolean studentNicUpdate(int index){
		boolean runtime = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Student NIC Update");
		System.out.println("==================");
		
		System.out.println("Registration Number  : "+regNoArray[index]);
		System.out.println("Student Name         : "+nameArray[index]);
		System.out.println("Student Current NIC  : "+nicArray[index]);
		
		System.out.print("\nEnter NIC  To Update - ");
		String studentNic = input.nextLine();
		if(checkNic(studentNic)){
			System.out.println("\tThis student is already added to the system...");
		}else{
			nicArray[index] = studentNic;
			System.out.println("\tStudent NIC updated successfully... ");
		}
		System.out.print("Do you want to update another student details? (y/n): ");
		String choice = input.next();
		if(choice.equals("n")){
			runtime = false;
		} 
		return runtime;
		
	}
	//student management - update student
	public static void updateStudent(){
		System.out.println("--------------------------------------------------------------");
		System.out.println("|                     Update Student                         |");
		System.out.println("--------------------------------------------------------------");
		boolean runtime = true;
		do{
			Scanner input = new Scanner(System.in);
			System.out.print("\nEnter Student Registration Number: ");
			String regNum = input.next();
			int index = checkRegNoIndex(regNum);
			if(index == -1){
				System.out.println("This student not exist in the system");
			}else{
				System.out.println("\t Student Name : "+nameArray[index]);
				System.out.println("\t NIC Number   : "+nicArray[index]);
				System.out.print("What do you want to update ?");
				System.out.println("\n\t(01) Student Name");
				System.out.println("\t(02) Student NIC");
				System.out.print("\nEnter Your Option - ");
				int uOption = input.nextInt();
				
				switch(uOption){
					case 1 : {
						runtime = studentNameUpdate(index);
						break;
					}
					case 2 :{
						runtime = studentNicUpdate(index);
						break;
					}
					default:{
						System.out.println("Invalid Input");
					}
					
				}
				
				
			}
			
			
		}while(runtime);
		clearConsole();
		homePage();
	}
	//Show student profile detail
	public static void showStudentProfile(int index){
		double prfMarks=0,dbmsMarks=0,marks=0;
		System.out.println("\tRegistation No     : "+regNoArray[index]);
		System.out.println("\tStudent Name       : "+nameArray[index]);
		System.out.println("\tStudent NIC        : "+nicArray[index]);
		if (prfArray[index] == -2){
			System.out.println("\tStudent PRF Marks  : Not Conducted");
			prfMarks = 0;
		}else if(prfArray[index] == -1){
			System.out.println("\tStudent PRF Marks  : Absent");
			prfMarks = 0;
		}else{
			System.out.println("\tStudent PRF Marks  : "+prfArray[index]);
		}
		marks = prfArray[index]; 
		prfMarks = marks>=90?4.45:marks>=80?4.00:marks>=75?3.70 :marks>=70?3.30 :marks>=65?3.00 :marks>=60?2.70 :marks>=55?2.30 :marks>=50?2.00 :marks>=45?1.70 :marks>=40?1.30 :marks>=30?1.00 :marks>=20?0.70 :0.00;
		marks = dbmsArray[index];
		dbmsMarks = marks>=90?4.45:marks>=80?4.00:marks>=75?3.70 :marks>=70?3.30 :marks>=65?3.00 :marks>=60?2.70 :marks>=55?2.30 :marks>=50?2.00 :marks>=45?1.70 :marks>=40?1.30 :marks>=30?1.00 :marks>=20?0.70 :0.00;
		if (dbmsArray[index] == -2){
			System.out.println("\tStudent DBMS Marks : Not Conducted");
			dbmsMarks = 0;
		}else if(dbmsArray[index] == -1){
			System.out.println("\tStudent DBMS Marks : Absent");
			dbmsMarks = 0;
		}else{
			System.out.println("\tStudent DBMS Marks : "+dbmsArray[index]);
		}
		double gpa = (dbmsMarks+prfMarks)/2;
		System.out.println("\tStudent GPA        : "+gpa);
	}
	//student management - view student
	public static void viewStudentProfile(){
		System.out.println("--------------------------------------------------------------");
		System.out.println("|                 View Student's Profile                     |");
		System.out.println("--------------------------------------------------------------");
		Scanner input = new Scanner(System.in);
		boolean runtime = true;
		do{
			System.out.print("Enter Student Registration No: ");
			String regNo=input.next();
			int index = checkRegNoIndex(regNo);
			if(index == -1){
				System.out.println("\tThis student doesnt exist in the system.");
			}else{
				showStudentProfile(index);
			}
			System.out.print("Do you want to search another student details (y/n): ");
			String uInput= input.next();
			if(uInput.equals("n")){
				runtime = false;
				
			}else{
				clearConsole();
				viewStudentProfile();
			}
		}while(runtime);
		clearConsole();
		studentManagement();
	}
	//Delete the student profile
	public static void deleteStudentFromArray(int index){
		String[] tempRegNoArray = new String[regNoArray.length-1];
		String[] tempNicArray = new String[nicArray.length-1];
		String[] tempNameArray = new String[nameArray.length-1];
		int[] tempPrfArray = new int[prfArray.length-1];
		int[] tempDbmsArray = new int[dbmsArray.length-1];
		
		for (int i = 0,x=0; i < tempRegNoArray.length ; i++,x++){
			if (index == i){
				x++;
				tempRegNoArray[i] = regNoArray[x];
				tempNicArray[i] = nicArray[x];
				tempNameArray[i] = nameArray[x];
				tempPrfArray[i] = prfArray[x];
				tempDbmsArray[i] = dbmsArray[x];
			}
			tempRegNoArray[i] = regNoArray[x];
			tempNicArray[i] = nicArray[x];
			tempNameArray[i] = nameArray[x];
			tempPrfArray[i] = prfArray[x];
			tempDbmsArray[i] = dbmsArray[x];
		}
		
		regNoArray = tempRegNoArray;
		nicArray = tempNicArray;
		nameArray = tempNameArray;
		prfArray = tempPrfArray;
		dbmsArray = tempDbmsArray;
		
		sortedRegNoArray= tempRegNoArray;
		sortedNicArray = tempNicArray;
		sortedNameArray = tempNameArray;
		sortedPrfArray = tempPrfArray;
		sortedDbmsArray = tempDbmsArray;
		
	}
	//student management - delete student
	public static void deleteStudentProfile(){
		System.out.println("--------------------------------------------------------------");
		System.out.println("|                 View Student's Profile                     |");
		System.out.println("--------------------------------------------------------------");
		Scanner input = new Scanner(System.in);
		boolean runtime = true;
		do{
			System.out.print("Enter Student Registration No: ");
			String regNo=input.next();
			int index = checkRegNoIndex(regNo);
			if(index == -1){
				System.out.println("\tThis student doesnt exist in the system.");
				deleteStudentProfile();
			}else{
				showStudentProfile(index);
				System.out.print("Do you want to delete this student's profile (y/n): ");
				String option= input.next();
				if(option.equals("n")){
					clearConsole();
					deleteStudentProfile();
				}else{
					deleteStudentFromArray(index);
					System.out.println("\n\tStudent was successfully deleted from the system...");
				}
			}
			System.out.print("\nDo you want to delete another student profile (y/n): ");
			String uInput= input.next();
			if(uInput.equals("n")){
				runtime = false;
				
			}else{
				clearConsole();
				deleteStudentProfile();
			}
		}while(runtime);
		clearConsole();
		studentManagement();
	}
	
    // Student Management
    public static void studentManagement() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|                         Student Management                    |");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Add Student");
        System.out.println("\n[2] Update Student ");
        System.out.println("\n[3] View Student Profile");
        System.out.println("\n[4] Delete Student Profile");
        System.out.println("\n[5] Exit");
        //Get user input
        Scanner input = new Scanner(System.in);
        do{
			System.out.print("\nEnter an option to continue > ");
			int option = input.nextInt();
			
			switch(option){
				case 1:{
					clearConsole();
					addStudent();
					break;
				}
				case 2:{
					clearConsole();
					updateStudent();
					break;
				}
				case 3:{
					clearConsole();
					viewStudentProfile();
					break;
				}
				case 4:{
					clearConsole();
					deleteStudentProfile();
					break;
				}
				case 5:{
					exit();
					break;
				}
				
			}	
		}while(true);
        

    }
	
    //============================================================Student management Completed=============================================
    //Adds the batch to the batchname array
    public static void addBatchToArray(int batchNum){
		int[] tempBatchNameArray = new int[batchNameArray.length+1];
		int[] tempBatchStatusArray = new int[batchStatusArray.length+1];
		for (int i = 0; i < batchNameArray.length; i++){
			tempBatchNameArray[i] = batchNameArray[i];
			tempBatchStatusArray[i] = batchStatusArray[i];
		}
		tempBatchNameArray[tempBatchNameArray.length-1] = batchNum;
		tempBatchStatusArray[tempBatchStatusArray.length-1] = ENROLLMENTOPEN;
		
		 batchNameArray = tempBatchNameArray;
		 batchStatusArray = tempBatchStatusArray;
		
		
	}
    //Batch management - add Batch
    public static void addBatch(){
		Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                               Add Batch                               |");
        System.out.println("-------------------------------------------------------------------------\n");
        boolean runtime = true;
        do{
			System.out.print("Enter Batch Number : ");
			int batchNum = input.nextInt();
			int index = checkBatch(batchNum);
			if (index != -1){
				System.out.println("\nBatch is already added to the system...\n");
			}else{
				addBatchToArray(batchNum);
				System.out.println("\nBatch was successfully added to the system...\n");
			}
			System.out.print("\nDo you want to add another batch to the system (y/n): ");
			String uInput= input.next();
			if(uInput.equals("n")){
				runtime = false;
				
			}		
		}while(runtime);
		clearConsole();
		batchManagement();
        
	}
	//Batch management - update Batch
	public static void updateBatch(){
		Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                            Update Batch                               |");
        System.out.println("-------------------------------------------------------------------------\n");
        boolean runtime = true;
        do{
			System.out.print("Enter Batch Number : ");
			int batchNum = input.nextInt();
			int index = checkBatch(batchNum);
			if (index == -1){
				System.out.println("\nBatch doesnt exist in the system...\n");
			}else{
				String batchStatus = batchStatusArray[index] == 1?"ENROLLMENT OPEN":"ENROLLMENT CLOSED";
				System.out.println("Current Status : "+batchStatus);
				if(batchStatusArray[index]==1){
					System.out.print("Do you want to change the batch status to ENROLLMENT CLOSED (y/n): ");
				}else{
					System.out.print("Do you want to change the batch status to ENROLLMENT OPEN (y/n): ");
				}
				String choice = input.next();
				if(choice.equals("y")){
					int newBatchStatus = batchStatusArray[index]==1?0:1;
					batchStatusArray[index] = newBatchStatus;
					System.out.println("\n\tBatch Status Updated Successfully...");
				}
			}
			System.out.print("\nDo you want to add another batch to the system (y/n): ");
			String uInput= input.next();
			if(uInput.equals("n")){
				runtime = false;
				
			}		
		}while(runtime);
		clearConsole();
		batchManagement();
        
	}
	//Batch management - view Batch
	public static void viewBatch(){
		Scanner input= new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------");
        System.out.println("|                                     View Batch                             |");
        System.out.println("------------------------------------------------------------------------------\n\n");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(" No\t\tBatch No\t\tStudent Count\t\tStatus");
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < batchNameArray.length; i++){
			String batchStatus = batchStatusArray[i]==1?"ENROLLMENT OPEN":"ENROLLMENT CLOSED";
			int count = findBatchStudentCount(batchNameArray[i]);
			System.out.println(" "+(i+1)+"\t\t"+batchNameArray[i]+"\t\t\t"+count+"\t\t\t"+batchStatus);
			System.out.println("-----------------------------------------------------------------------------------");
		}
		System.out.println("Do you want to go to the homepage (y/n): ");
		String uOption = input.next();
		
		if(uOption.equals("y")){
			clearConsole();
			homePage();
		}else{
			clearConsole();
			batchManagement();
		}
	}
	public static int findBatchStudentCount(int batchNum){
		int count= 0;
		String newBatchNo = batchNum +"";
		for (int i = 0; i <regNoArray.length ; i++){
			if(newBatchNo.equals(regNoArray[i].substring(4,7))){
				count++;
			}
		}
		return count;
	}
    // Batch Management
    public static void batchManagement() {
		Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                               Batch Management                        |");
        System.out.println("-------------------------------------------------------------------------\n");
        
        System.out.println(" [1] Add Batch");
        System.out.println(" [2] Update Batch");
        System.out.println(" [3] View Batches");
        System.out.println(" [4] Exit\n");
        System.out.print("Enter an option to continue > ");
        int uOption = input.nextInt();
        
        switch(uOption){
			case 1:{
				clearConsole();
				addBatch();
				break;
			}
			case 2:{
				clearConsole();
				updateBatch();
				break;
			}
			case 3:{
				clearConsole();
				viewBatch();
				break;
			}
			case 4:{
				clearConsole();
				homePage();
			}
		}
        

    }

   // Grade Management - update prf marks
   public static void prfMarksChange(){
	    System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                            PRF Marks Update                           |");
        System.out.println("-------------------------------------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        boolean runtime = true;
        do{
			System.out.print("\nEnter Student Registration No: ");
			String regNum = input.next();
			int index = checkRegNoIndex(regNum);
			if(index==-1){
				System.out.println("\n\tThis student doesnt exist");
			}else{
				System.out.println("\n\tRegistration No : "+regNoArray[index]);
				System.out.println("\tStudent Name    : "+nameArray[index]);
				System.out.println("\tAtudent Nic     : "+nicArray[index]);
				if(prfArray[index] != -1 && prfArray[index] != -2){
					System.out.println("This student already completed the PRF module.");
					System.out.println("\t PRF Marks : "+prfArray[index]);
					System.out.print("Do you want to update this student's PRF marks?(y/n) ");
					String option = input.next();
					if(option.equals("y")){
						System.out.print("\tEnter PRF Marks : ");
						int prfMarks = input.nextInt();
						prfArray[index] = prfMarks;
						System.out.println("\tThis Student's PRF marks updated successfully...");
					}
					
				}else if(prfArray[index] == -1){
					
					System.out.println("This student was absent for the exam. You can update the marks if they participate in it...(-1 to terminate) ");
					System.out.print("\tEnter PRF Marks : ");
					int prfMarks = input.nextInt();
					if(prfMarks != -1){
						prfArray[index] = prfMarks;
						System.out.println("\tThis Student's PRF marks updated successfully...");
					}
				}else{
					System.out.print("\tEnter PRF Marks : ");
					int prfMarks = input.nextInt();
					prfArray[index] = prfMarks;
					System.out.println("\tThis Student's PRF marks updated successfully...");
				}
			}
			System.out.print("\nDo you want to update another student's PRF marks (y/n): ");
			String uInput= input.next();
			if(uInput.equals("n")){
				runtime = false;
				clearConsole();
				homePage();
			}else{
				clearConsole();
				prfMarksChange();
			}
		}while(runtime);
		clearConsole();
		gradeManagement();
        
        
	}
    // Grade Management - update dbms marks
   public static void dbmsMarksChange(){
	    System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                           DBMS Marks Update                           |");
        System.out.println("-------------------------------------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        boolean runtime = true;
        do{
			System.out.print("\nEnter Student Registration No: ");
			String regNum = input.next();
			int index = checkRegNoIndex(regNum);
			if(index==-1){
				System.out.println("\n\tThis student doesnt exist");
			}else{
				System.out.println("\n\tRegistration No : "+regNoArray[index]);
				System.out.println("\tStudent Name    : "+nameArray[index]);
				System.out.println("\tAtudent Nic     : "+nicArray[index]);
				if(dbmsArray[index] != -1 && dbmsArray[index] != -2){
					System.out.println("This student already completed the DBMS module.");
					System.out.println("\t DBMS Marks : "+dbmsArray[index]);
					System.out.print("Do you want to update this student's DBMS marks?(y/n) ");
					String option = input.next();
					if(option.equals("y")){
						System.out.print("\tEnter DBMS Marks : ");
						int dbmsMarks = input.nextInt();
						dbmsArray[index] = dbmsMarks;
						System.out.println("\tThis Student's DBMS marks updated successfully...");
					}
					
				}else if(dbmsArray[index] == -1){
					
					System.out.println("This student was absent for the exam. You can update the marks if they participate in it...(-1 to terminate) ");
					System.out.print("\tEnter DBMS Marks : ");
					int dbmsMarks = input.nextInt();
					if(dbmsMarks != -1){
						dbmsArray[index] = dbmsMarks;
						System.out.println("\tThis Student's DBMS marks updated successfully...");
					}
				}else{
					System.out.print("\tEnter DBMS Marks : ");
					int dbmsMarks = input.nextInt();
					dbmsArray[index] = dbmsMarks;
					System.out.println("\tThis Student's DBMS marks updated successfully...");
				}
			}
			System.out.print("\nDo you want to update another student's DBMS marks (y/n): ");
			String uInput= input.next();
			if(uInput.equals("n")){
				runtime = false;
				clearConsole();
				homePage();
			}else{
				clearConsole();
				dbmsMarksChange();
			}
		}while(runtime);
		clearConsole();
		gradeManagement();
	}
//=================================================================================================================================
    // Grade Management
    public static void gradeManagement() {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                            Grade Management                           |");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] PRF Marks Update");
        System.out.println("\n[2] DBMS Marks Update ");
        System.out.println("\n[3] Exit");
        
        System.out.print("\nEnter an option to continue > ");
        int uOption=input.nextInt();
        switch(uOption){
			case 1:{
				clearConsole();
				prfMarksChange();
				break;
			}
			case 2:{
				clearConsole();
				dbmsMarksChange();
				break;
			}case 3:{
				clearConsole();
				homePage();
			}
		}
		
        

    }
	//Sorted Arrays
	public static void makeSortedArrays(){
		for (int i = 0; i < regNoArray.length; i++){
			sortedNameArray[i] = nameArray[i];
			sortedNicArray[i] =nicArray[i];
			sortedRegNoArray[i] = regNoArray[i];
			sortedDbmsArray[i] = dbmsArray[i];
			sortedPrfArray[i] = prfArray[i];
		}
		
        for (int i = nameArray.length-1; i > 0; i--){
			for (int j = 0; j < i; j++){
				if(sortedNameArray[j].compareTo(sortedNameArray[j+1])>0){
					String name = sortedNameArray[j];
					sortedNameArray[j] = sortedNameArray[j+1];
					sortedNameArray[j+1] = name;
					
					String nic = sortedNicArray[j];
					sortedNicArray[j] = sortedNicArray[j+1];
					sortedNicArray[j+1] = nic;
					
					String regNo = sortedRegNoArray[j];
					sortedRegNoArray[j] = sortedRegNoArray[j+1];
					sortedRegNoArray[j+1] = regNo;
					
					int dbms = sortedDbmsArray[j];
					sortedDbmsArray[j] = sortedDbmsArray[j+1];
					sortedDbmsArray[j+1] = dbms;
					
					int prf = sortedPrfArray[j];
					sortedPrfArray[j] = sortedPrfArray[j+1];
					sortedPrfArray[j+1] = prf;
				}
			}
		}
		
		
	}
	//Report Generator- Whole students report
    public static void studentReport(){
		Scanner input = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                           Student Registration Report                                                                  ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" No   Registration No     Student Name                   NIC                PRF Marks             DBMS Marks     GPA");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        makeSortedArrays();
        for (int i = 0; i < sortedRegNoArray.length; i++){
			int marks = sortedPrfArray[i]; 
			double prfMarks = marks>=90?4.45:marks>=80?4.00:marks>=75?3.70 :marks>=70?3.30 :marks>=65?3.00 :marks>=60?2.70 :marks>=55?2.30 :marks>=50?2.00 :marks>=45?1.70 :marks>=40?1.30 :marks>=30?1.00 :marks>=20?0.70 :0.00;
			marks = sortedDbmsArray[i];
			double dbmsMarks = marks>=90?4.45:marks>=80?4.00:marks>=75?3.70 :marks>=70?3.30 :marks>=65?3.00 :marks>=60?2.70 :marks>=55?2.30 :marks>=50?2.00 :marks>=45?1.70 :marks>=40?1.30 :marks>=30?1.00 :marks>=20?0.70 :0.00;
			double gpa = (dbmsMarks+prfMarks)/2;
			//System.out.println((i+1)+"\t\t"+sortedRegNoArray[i]+"\t\t"+sortedNameArray[i]+"\t\t"+sortedNicArray[i]+"\t\t"+sortedPrfArray[i]+"\t\t"+sortedDbmsArray[i]+"\t\t"+gpa);
			String fs=String.format("%03d   %s   %-35s  %-25s  %-15d  %-10d  %.2f",(i+1),sortedRegNoArray[i],sortedNameArray[i],sortedNicArray[i],sortedPrfArray[i],sortedDbmsArray[i],gpa);
			System.out.println(fs);
		}
		System.out.print("\nDo you want to go to homepage (y/n): ");
		String uInput= input.next();
		if(uInput.equals("n")){
			clearConsole();
			reportGenerator();
				
		}else{
			clearConsole();
			homePage();
		}
	}
	public static void batchReport(int batch){
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                      "+batch+" Batch Student Report                                                                  ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" No   Registration No     Student Name                   NIC                PRF Marks             DBMS Marks     GPA");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		makeSortedArrays();
		String batchNum = batch + "";
		int x =1;
		for (int i = 0; i < sortedRegNoArray.length; i++){
			if(batchNum.equals(sortedRegNoArray[i].substring(4,7))){
				int marks = sortedPrfArray[i]; 
				double prfMarks = marks>=90?4.45:marks>=80?4.00:marks>=75?3.70 :marks>=70?3.30 :marks>=65?3.00 :marks>=60?2.70 :marks>=55?2.30 :marks>=50?2.00 :marks>=45?1.70 :marks>=40?1.30 :marks>=30?1.00 :marks>=20?0.70 :0.00;
				marks = sortedDbmsArray[i];
				double dbmsMarks = marks>=90?4.45:marks>=80?4.00:marks>=75?3.70 :marks>=70?3.30 :marks>=65?3.00 :marks>=60?2.70 :marks>=55?2.30 :marks>=50?2.00 :marks>=45?1.70 :marks>=40?1.30 :marks>=30?1.00 :marks>=20?0.70 :0.00;
				double gpa = (dbmsMarks+prfMarks)/2;
				//System.out.println(x+"\t\t"+sortedRegNoArray[i]+"\t\t"+sortedNameArray[i]+"\t\t"+sortedNicArray[i]+"\t\t"+sortedPrfArray[i]+"\t\t"+sortedDbmsArray[i]+"\t\t"+gpa);
				String fs=String.format("%03d   %s   %-35s  %-25s  %-15d  %-10d  %.2f",x,sortedRegNoArray[i],sortedNameArray[i],sortedNicArray[i],sortedPrfArray[i],sortedDbmsArray[i],gpa);
				System.out.println(fs);
				x++;
			}
		}
		
	}
	//Report Generator- batchwise students report
	public static void batchwiseStudentReport(){
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                           Batch-wise Student Report                                                                  ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        System.out.println("[1] 105 Batch");
        System.out.println("\n[2] 106 Batch");
        System.out.println("\n[3] 107 Batch");
        System.out.println("\n[4] 108 Batch");
        System.out.println("\n[5] 109 Batch");
        System.out.println("\n[6] 110 Batch");
        System.out.println("\n[7] Exit");
        Scanner input= new Scanner(System.in);
        boolean runtime = true;
        do{
			System.out.print("\nEnter an option to continue > ");
			int uOption=input.nextInt();
			switch(uOption){
				case 1:{
					clearConsole();
					batchReport(105);
					break;
				}
				case 2:{
					clearConsole();
					batchReport(106);
					break;
				}case 3:{
					clearConsole();
					batchReport(107);
					break;
				}
				case 4:{
					clearConsole();
					batchReport(108);
					break;
				}
				case 5:{
					clearConsole();
					batchReport(109);
					break;
				}
				case 6:{
					clearConsole();
					batchReport(110);
					break;
				}
				
				default:{
					clearConsole();
					homePage();
				}
			}
			System.out.print("\nDo you want another batch report (y/n): ");
			String uInput= input.next();
			if(uInput.equals("n")){
				runtime = false;
				
			}else{
				clearConsole();
				batchwiseStudentReport();
			}
			
		}while(runtime);
		clearConsole();
		homePage();
	}	
	//Report Generator- industry training students report
	public static void industryTrainingReport(){
		Scanner input = new Scanner(System.in); 
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                             Industry Training Eligibility Report                                                  ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" No   Registration No     Student Name                   NIC                PRF Marks             DBMS Marks     GPA");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		makeSortedArrays();
		int x =1;
		for (int i = 0; i < sortedRegNoArray.length-1; i++){
			int marks = sortedPrfArray[i]; 
			double prfMarks = marks>=90?4.45:marks>=80?4.00:marks>=75?3.70 :marks>=70?3.30 :marks>=65?3.00 :marks>=60?2.70 :marks>=55?2.30 :marks>=50?2.00 :marks>=45?1.70 :marks>=40?1.30 :marks>=30?1.00 :marks>=20?0.70 :0.00;
			marks = sortedDbmsArray[i];
			double dbmsMarks = marks>=90?4.45:marks>=80?4.00:marks>=75?3.70 :marks>=70?3.30 :marks>=65?3.00 :marks>=60?2.70 :marks>=55?2.30 :marks>=50?2.00 :marks>=45?1.70 :marks>=40?1.30 :marks>=30?1.00 :marks>=20?0.70 :0.00;
			double gpa = (dbmsMarks+prfMarks)/2;
			if(sortedDbmsArray[i]>=50 && sortedPrfArray[i]>=50 && gpa > 3.25){
				//System.out.println(x+"\t\t"+sortedRegNoArray[i]+"\t\t"+sortedNameArray[i]+"\t\t"+sortedNicArray[i]+"\t\t"+sortedPrfArray[i]+"\t\t"+sortedDbmsArray[i]+"\t\t"+gpa);
				String fs=String.format("%03d   %s   %-35s  %-25s  %-15d  %-10d  %.2f",x,sortedRegNoArray[i],sortedNameArray[i],sortedNicArray[i],sortedPrfArray[i],sortedDbmsArray[i],gpa);
				System.out.println(fs);
				x++;
			}
		}
		System.out.print("\nDo you want to go to homepage (y/n): ");
		String uInput= input.next();
		if(uInput.equals("n")){
			clearConsole();
			reportGenerator();
				
		}else{
			clearConsole();
			homePage();
		}
	
	}
    // Report Generator
    public static void reportGenerator() {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|                            Grade Management                           |");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] Student Registration Report");
        System.out.println("\n[2] Batch-wise Student Report ");
        System.out.println("\n[3] Industry Training Eligibility Report ");
        System.out.println("\n[4] Exit");
        
        System.out.print("\nEnter an option to continue > ");
        int uOption=input.nextInt();
        switch(uOption){
			case 1:{
				clearConsole();
				studentReport();
				break;
			}
			case 2:{
				clearConsole();
				batchwiseStudentReport();
				break;
			}case 3:{
				clearConsole();
				industryTrainingReport();
				break;
			}
			default:{
				clearConsole();
				homePage();
			}
			
		}
        
    }

      
    // main method
    public static void main(String args[]) {
        homePage();
    }

}

