import java.util.Random;

public class assign03 {

	public static sort s = new sort();

	public static int [] data1 = new int [1000];
	public static int [] data2 = new int [1000];
	public static int [] data3 = new int [10000];
	public static int [] data4 = new int [10000];
	public static int [] data5 = new int [100000];
	public static int [] data6 = new int [100000];

	public static void main(String[] args) {

		System.out.print("\t\t\tRandom 1000");
		System.out.print("\tReverse 1000");
		System.out.print("\tRandom 10000");
		System.out.print("\tReverse 100000");
		System.out.print("\tRandom 100000");
		System.out.println("\tReverse 100000");

		System.out.print("Bubble Sort");
		System.out.print("\t\t" + s.bubble_sort(create_random_data(data1, 1000), 1000));
		System.out.print("\t\t" + s.bubble_sort(create_reverse_data(data2, 1000), 1000));
		System.out.print("\t\t" + s.bubble_sort(create_random_data(data3, 10000), 10000));
		System.out.print("\t\t" + s.bubble_sort(create_reverse_data(data4, 10000), 10000));
		System.out.print("\t\t" + s.bubble_sort(create_random_data(data5, 100000), 100000));
		System.out.print("\t\t" + s.bubble_sort(create_reverse_data(data6, 100000), 100000));

		System.out.print("\nSelection Sort");
		System.out.print("\t\t" + s.selection_sort(create_random_data(data1, 1000), 1000));
		System.out.print("\t\t" + s.selection_sort(create_reverse_data(data2, 1000), 1000));
		System.out.print("\t\t" + s.selection_sort(create_random_data(data3, 10000), 10000));
		System.out.print("\t\t" + s.selection_sort(create_reverse_data(data4, 10000), 10000));
		System.out.print("\t\t" + s.selection_sort(create_random_data(data5, 100000), 100000));
		System.out.print("\t\t" + s.selection_sort(create_reverse_data(data6, 100000), 100000));

		System.out.print("\nInsertion Sort");
		System.out.print("\t\t" + s.insertion_sort(create_random_data(data1, 1000), 1000));
		System.out.print("\t\t" + s.insertion_sort(create_reverse_data(data2, 1000), 1000));
		System.out.print("\t\t" + s.insertion_sort(create_random_data(data3, 10000), 10000));
		System.out.print("\t\t" + s.insertion_sort(create_reverse_data(data4, 10000), 10000));
		System.out.print("\t\t" + s.insertion_sort(create_random_data(data5, 100000), 100000));
		System.out.print("\t\t" + s.insertion_sort(create_reverse_data(data6, 100000), 100000));

		System.out.print("\nMerge Sort");
		System.out.print("\t\t" + s.merge_sort(create_random_data(data1, 1000), 0, 999));
		System.out.print("\t\t" + s.merge_sort(create_reverse_data(data2, 1000), 0, 999));
		System.out.print("\t\t" + s.merge_sort(create_random_data(data3, 10000), 0, 9999));
		System.out.print("\t\t" + s.merge_sort(create_reverse_data(data4, 10000), 0, 9999));
		System.out.print("\t\t" + s.merge_sort(create_random_data(data5, 100000), 0, 99999));
		System.out.print("\t\t" + s.merge_sort(create_reverse_data(data6, 100000), 0, 99999));

		System.out.print("\nQuick Sort1");
		System.out.print("\t\t" + s.quick_sort1(create_random_data(data1, 1000), 0, 999));
		System.out.print("\t\t" + s.quick_sort1(create_reverse_data(data2, 1000), 0, 999));
		System.out.print("\t\t" + s.quick_sort1(create_random_data(data3, 10000), 0, 9999));
		System.out.print("\t\t" + s.quick_sort1(create_reverse_data(data4, 10000), 0, 9999));
		System.out.print("\t\t" + s.quick_sort1(create_random_data(data5, 100000), 0, 99999));
//		System.out.print("\t\t" + s.quick_sort1(create_reverse_data(data6, 100000), 0, 99999));

		System.out.print("\nQuick Sort2");
		System.out.print("\t\t" + s.quick_sort2(create_random_data(data1, 1000), 0, 999));
		System.out.print("\t\t" + s.quick_sort2(create_reverse_data(data2, 1000), 0, 999));
		System.out.print("\t\t" + s.quick_sort2(create_random_data(data3, 10000), 0, 9999));
		System.out.print("\t\t" + s.quick_sort2(create_reverse_data(data4, 10000), 0, 9999));
		System.out.print("\t\t" + s.quick_sort2(create_random_data(data5, 100000), 0, 99999));
//		System.out.print("\t\t" + s.quick_sort2(create_reverse_data(data6, 100000), 0, 99999));

		/*	 System.out.print("\nQuick Sort3");
		 System.out.print("\t\t" + s.quick_sort3(create_random_data(data1, 1000), 0, 999));
		 System.out.print("\t\t" + s.quick_sort3(create_reverse_data(data2, 1000), 0, 999));
		 System.out.print("\t\t" + s.quick_sort3(create_random_data(data3, 10000), 0, 9999));
		 System.out.print("\t\t" + s.quick_sort3(create_reverse_data(data4, 10000), 0, 9999));
		 System.out.print("\t\t" + s.quick_sort3(create_random_data(data5, 100000), 0, 99999));
		 System.out.print("\t\t" + s.quick_sort3(create_reverse_data(data6, 100000), 0, 99999));
		 */
		
		System.out.print("\nHeap Sort");
		System.out.print("\t\t" + s.heap_sort(create_random_data(data1, 1000), 999));
		System.out.print("\t\t" + s.heap_sort(create_reverse_data(data2, 1000), 999));
		System.out.print("\t\t" + s.heap_sort(create_random_data(data3, 10000), 9999));
		System.out.print("\t\t" + s.heap_sort(create_reverse_data(data4, 10000), 9999));
		System.out.print("\t\t" + s.heap_sort(create_random_data(data5, 100000), 99999));
		System.out.print("\t\t" + s.heap_sort(create_reverse_data(data6, 100000), 99999));

		System.out.print("\nContain Sort");
		System.out.print("\t\t" + s.contain_sort(create_random_data(data1, 1000)));
		System.out.print("\t\t" + s.contain_sort(create_reverse_data(data2, 1000)));
		System.out.print("\t\t" + s.contain_sort(create_random_data(data3, 10000)));
		System.out.print("\t\t" + s.contain_sort(create_reverse_data(data4, 10000)));
		System.out.print("\t\t" + s.contain_sort(create_random_data(data5, 100000)));
		System.out.print("\t\t" + s.contain_sort(create_reverse_data(data6, 100000)));

	}


	static int [] create_random_data(int [] data, int size) {
		for (int i = 0; i < size; i++) {
			Random rand = new Random();
			data[i] = rand.nextInt();
		}
		return data;
	}

	static int [] create_reverse_data(int [] data, int size) {
		for(int i = 0; i < size; i++)
			data[i] = size - i;
		return data;
	}
}
