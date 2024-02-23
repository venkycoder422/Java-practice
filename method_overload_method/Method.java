package method_overload_method;

public class Method {

    public static void main(String args[]) {
        Method method = new Method(); 
        method.addNumbers(0, 0, 1); // returned
        method.addNumbers(2, 0, 0); // approved
        method.addNumbers(1, 0,0); // Ongoing
        method.addNumbers(1, 1,0); // returned
        method.addNumbers(0, 1, 0); // ongoing
        method.addNumbers(1, 1,0); // returned
        method.addNumbers(0, 2, 0); // rejected
        method.addNumbers(2, 0,0); // Ongoing

    }

    public void addNumbers(int app, int rej,int ret) {
        int noApprovers = 2;
        int endedApprove = app+rej;
        if(ret>0){
            endedApprove=endedApprove+1*ret;
            noApprovers= noApprovers+1*ret;
        }

        if(ret>0 && (app==0 || rej==0)){
            System.out.println("Returned");
        } else if(ret>0 && (app>0 || rej>0) && noApprovers!=endedApprove){
            System.out.println("Ongoing returned application");
        }
        else if ((app >=1 || rej >= 1) && noApprovers!=endedApprove){
            System.out.println("Ongoing");
        } else if(noApprovers==endedApprove && rej==0 && ret==0){
            System.out.println("Approved");
        } else if (noApprovers == endedApprove && app==0 && ret ==0){
            System.out.println("Rejected");
        } else if (noApprovers==endedApprove && app>0 && rej>0 && ret==0){
            System.out.println("Returned");
        }
        
    }
     

}
