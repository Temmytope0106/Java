import java.util.Scanner;
public class PersonalityTest{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);


	System.out.print("Hello!!!....What is your name?: ");
	String name = input.nextLine();
	
	int noOfA = 0;
	int noOfB = 0;


	
	System.out.println(" A. expend energy, enjoy groups    B. conserve energy, enjoy one-on-one");
	char answer = input.next().charAt(0);
	if(answer == 'A' || answer == 'B'){
			noOfA += answer;
			noOfB += answer;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
				System.out.println(" A. expend energy, enjoy groups    B. conserve energy, enjoy one-on-one");
				answer = input.next().charAt(0);
				}
				


	System.out.println(" A. more outgoing, think out loud    B. more reserved, think to yourself");
	char answer1 = input.next().charAt(0);
	if(answer1 == 'A' || answer1 == 'B'){
			noOfA += answer1;
			noOfB += answer1;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. more outgoing, think out loud    B. more reserved, think to yourself");
			answer = input.next().charAt(0);
				}
				



	System.out.println(" A. seek many tasks, public activities, interaction with others    B. seek private, solitary activities with quiet to concentrate");
	char answer2 = input.next().charAt(0);
	if(answer2 == 'A' || answer2 == 'B'){
			noOfA += answer2;
			noOfB += answer2;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. seek many tasks, public activities, interaction with others    B. seek private, solitary activities with quiet to concentrate");
			answer2 = input.next().charAt(0);
				}
				



	System.out.println(" A. external, communicative, express yourself    B. internal, reticent, keep to yourself");
	char answer3 = input.next().charAt(0);
	if(answer3 == 'A' || answer3 == 'B'){
			noOfA += answer3;
			noOfB += answer3;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. external, communicative, express yourself    B. internal, reticent, keep to yourself");
			answer3 = input.next().charAt(0);
				}

	System.out.println(" A. active, initiate    B. reflective, deliberate");
	char answer4 = input.next().charAt(0);
	if(answer4 == 'A' || answer4 == 'B'){
			noOfA += answer4;
			noOfB += answer4;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. active, initiate    B. reflective, deliberate");
			answer4 = input.next().charAt(0);
				}



	System.out.println(" A. Interpret literally,    B. look for meaning and possibilities");
	char answer5 = input.next().charAt(0);
	if(answer5 == 'A' || answer5 == 'B'){
			noOfA += answer5;
			noOfB += answer5;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. Interpret literally,    B. look for meaning and possibilities");
			answer5 = input.next().charAt(0);
				}



	System.out.println(" A. Practical, realistic, experiential    B. imaginative, innovative, theoretical");
	char answer6 = input.next().charAt(0);
	if(answer6 == 'A' || answer6 == 'B'){
			noOfA += answer6;
			noOfB += answer6;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. Practical, realistic, experiential    B. imaginative, innovative, theoretical");
			answer6 = input.next().charAt(0);
				}


	System.out.println(" A. standard, ususal, conventional    B. different, novel, unique");
	char answer7 = input.next().charAt(0);
	if(answer7 == 'A' || answer7 == 'B'){
			noOfA += answer7;
			noOfB += answer7;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. standard, ususal, conventional    B. different, novel, unique");
			answer7 = input.next().charAt(0);
				}



	System.out.println(" A. focus on here and now    B. look to the future, global perspective, big picture");
	char answer8 = input.next().charAt(0);
	if(answer8 == 'A' || answer8 == 'B'){
			noOfA += answer8;
			noOfB += answer8;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. focus on here and now    B. look to the future, global perspective, big picture");
			answer8 = input.next().charAt(0);
				}



	System.out.println(" A. facts, things, what is    B. ideas, dreams, what could be, philosophical");
	char answer9 = input.next().charAt(0);
	if(answer9 == 'A' || answer9 == 'B'){
			noOfA += answer9;
			noOfB += answer9;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. facts, things, what is    B. ideas, dreams, what could be, philosophical");
			answer9 = input.next().charAt(0);
				}


	System.out.println(" A. logical, thinking, questioning    B. empathetic, feeling, accomodating");
	char answer10 = input.next().charAt(0);
	if(answer10 == 'A' || answer10 == 'B'){
			noOfA += answer10;
			noOfB += answer10;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. logical, thinking, questioning    B. empathetic, feeling, accomodating");
			answer10 = input.next().charAt(0);
				}



	System.out.println(" A. candid, straightforward, frank    B. tactful, kind, encouraging");
	char answer11 = input.next().charAt(0);
	if(answer11 == 'A' || answer11 == 'B'){
			noOfA += answer11;
			noOfB += answer11;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. candid, straightforward, frank    B. tactful, kind, encouraging");
			answer11 = input.next().charAt(0);
				}



	System.out.println(" A. firm, tend to criticize, hold the line    B. gentle, tend to appreciate, conciliate");
	char answer12 = input.next().charAt(0);
	if(answer12 == 'A' || answer12 == 'B'){
			noOfA += answer12;
			noOfB += answer12;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. firm, tend to criticize, hold the line    B. gentle, tend to appreciate, conciliate");
			answer12 = input.next().charAt(0);
				}


	System.out.println(" A. tough-minded, just    B. tender-hearted, merciful");
	char answer13 = input.next().charAt(0);
	if(answer13 == 'A' || answer13 == 'B'){
			noOfA += answer13;
			noOfB += answer13;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. tough-minded, just    B. tender-hearted, merciful");
			answer13 = input.next().charAt(0);
				}



	System.out.println(" A. matter of fact, issue-oriented    B. sensitive, people-oriented, compassionate");
	char answer14 = input.next().charAt(0);
	if(answer14 == 'A' || answer14 == 'B'){
			noOfA += answer14;
			noOfB += answer14;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. matter of fact, issue-oriented    B. sensitive, people-oriented, compassionate");
			answer14 = input.next().charAt(0);
				}



	System.out.println(" A. organized, orderly    B. flexible, adaptable");
	char answer15 = input.next().charAt(0);
	if(answer15 == 'A' || answer15 == 'B'){
			noOfA += answer15;
			noOfB += answer15;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. organized, orderly    B. flexible, adaptable");
			answer15 = input.next().charAt(0);
				}



	System.out.println(" A. plan, schedule    B. unplanned, spontaneous");
	char answer16 = input.next().charAt(0);
	if(answer16 == 'A' || answer16 == 'B'){
			noOfA += answer16;
			noOfB += answer16;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. plan, schedule    B. unplanned, spontaneous");
			answer16 = input.next().charAt(0);
				}



	System.out.println(" A. regulated, structured    B. easy-going, live and let live");
	char answer17 = input.next().charAt(0);
	if(answer17 == 'A' || answer17 == 'B'){
			noOfA += answer17;
			noOfB += answer17;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. regulated, structured    B. easy-going, live and let live");
			answer17 = input.next().charAt(0);
				}



	System.out.println(" A. preparation, plan ahead    B. go with the flow, adapt as you go");
	char answer18 = input.next().charAt(0);
	if(answer18 == 'A' || answer18 == 'B'){
			noOfA += answer18;
			noOfB += answer18;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. preparation, plan ahead    B. go with the flow, adapt as you go");
			answer18 = input.next().charAt(0);
				}



	System.out.println(" A. control, govern    B. latitude, freedom");
	char answer19 = input.next().charAt(0);	
	if(answer19 == 'A' || answer19 == 'B'){
			noOfA += answer19;
			noOfB += answer19;
			}else{
			System.out.println("Expected A or B as response. This an error please retry again");
			System.out.println(" A. control, govern    B. latitude, freedom");
			answer19 = input.next().charAt(0);
				}



		System.out.print("Hello " +name);
		System.out.println(" You selected");
		System.out.print(answer);
		System.out.print(answer1);
		System.out.print(answer2);
		System.out.print(answer3);
		System.out.print(answer4);
		System.out.print(answer5);
		System.out.print(answer6);
		System.out.print(answer7);
		System.out.print(answer8);
		System.out.print(answer9);
		System.out.print(answer10);
		System.out.print(answer11);
		System.out.print(answer12);
		System.out.print(answer13);
		System.out.print(answer14);
		System.out.print(answer15);
		System.out.print(answer16);
		System.out.print(answer17);
		System.out.print(answer18);
		System.out.println(answer19);


		System.out.print("The number of B selected: ");
		System.out.println(noOfA);
		System.out.print("The number of B selected: ");
		System.out.print(noOfB);
		
	












}
}