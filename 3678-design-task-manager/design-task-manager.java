class TaskManager {
    /*----------------------------|=============|------------------------------*/
    /*----------------------------|Code By Rohan|------------------------------*/
    /*----------------------------|=============|------------------------------*/
    
    /*-----------------------------Input  Scanner -----------------------------*/
    public static Scanner sc=new Scanner(System.in);
    
    /*---------------------------Modulo Function-------------------------------*/
    
    public static long mod=(long)1e9+7;
    
    /*---------------------------Palindrome or Not-----------------------------*/
    public static  boolean isPalin(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
        }
        return true;
    }
    
    /*---------------------------Prime or Not Prime----------------------------*/
    public static boolean isPrime(int n){
        if(n==0 || n==1)return false;
        for(int i=0;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    /*-------------------------Greatest Commmon Divisior-----------------------*/
    public static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    /*----------------------------Binary Exponentiation------------------------*/
    public static long power(long a,long b){
        if(b==0)return 1;
        long res=power(a,b/2);
        if(b%2==1)
            return res*res*a;
        else
            return res*res;
    }
    /*---------------------------Main Code-------------------------------------*/ 
     static class Task {
        int userId;
        int taskId;
        int priority;

        Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }
    public static boolean Code_By_Rohan(String s,String p){
        String[] str = p.split("\\*", 2);
        String pre = str[0];
        String suf = str[1];

        for (int i = 0; i <= s.length() - pre.length(); i++) {
            if (s.startsWith(pre, i)) {
                int startIndex = i + pre.length();
                if (s.substring(startIndex).contains(suf)) {
                    return true;
                }
            }
        }
        return false;
        
    }

    private Map<Integer, Task> taskMap;
    private TreeSet<Task> taskSet;

    private static final Comparator<Task> taskComparator = (a, b) -> {
        if (a.priority != b.priority) {
            return Integer.compare(b.priority, a.priority);
        }
        return Integer.compare(b.taskId, a.taskId);
    };

    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        taskSet = new TreeSet<>(taskComparator);
        for (List<Integer> t : tasks) {
            int userId = t.get(0);
            int taskId = t.get(1);
            int priority = t.get(2);
            add(userId, taskId, priority);
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        taskMap.put(taskId, task);
        taskSet.add(task);
    }

    public void edit(int taskId, int newPriority) {
        Task task = taskMap.get(taskId);
        if (task != null) {
            taskSet.remove(task);
            task.priority = newPriority;
            taskSet.add(task);
        }
    }

    public void rmv(int taskId) {
        Task task = taskMap.get(taskId);
        if (task != null) {
            taskSet.remove(task);
            taskMap.remove(taskId);
        }
    }

    public int execTop() {
        if (taskSet.isEmpty()) return -1;
        Task topTask = taskSet.pollFirst();
        taskMap.remove(topTask.taskId);
        return topTask.userId;
    }
}