class Sort{
public static void main(String args []){
int array[]={12,122,22,21,23,0};

//for (int index=0;index<array.length;index++){

//System.out.print(array[index] + " ");

//}

for (int index=0;index<array.length;index++){
	int dummy=0;
for (int anotherindex = index+1;anotherindex<array.length;anotherindex++){
if(array[anotherindex]<array[index]){
dummy=array[index];
array[index]=array[anotherindex];
array[anotherindex]=dummy;

}


}
}
for (int index=0;index<array.length;index++){
System.out.println(array[index] );
}
}

}