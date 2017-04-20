val numbers = List(1, 2, 3, 4, 5, 6)

//Java : should feel dirty
//List<Integer> doubled = new ArrayList<>();
//for(int e : numbers){
//  doubled.add(e * 2);
//}

println(numbers.map { e => e * 2 })

//Function has 4 thgs
//- body
//- name
//- parameter list
//- return type (Infer)