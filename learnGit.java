 class git {
    
// what is git ?
//ans: git is version control system
// It save all changes of our code 

/*  step 1: add the config
  using the command 
  git config --global user.name "your name"

  Add the email
  git config --global user.email "your email"
*******************************

 for change in direct config file 

 cmd - git config --global --edit

// for Exit the file ->
cmd  esc ":wq"


// making git repo

cmd "git init"

--------------------------------------------------
// for checking the all status of the file 

cmd git status 
---------------------------------------------------
// for adding the file 

cmd git add <file name> or git add . for all the file 
Now
, the file is in the 
 staging area

 // staging area means HOLD the changes Before the finally commit 

// Then , for commit the file 
\cmd git commit -m "message of commit"
 The message is a meanning ful

// for showing all the before commit command we use is 
  cmd "git log"

  // for going back to commit 

  cmd git checkout < commit hash code/bracnh name >

  // for going to our master
   git checkout master
   

*/  
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Multiplication  is "+(a*b));
    }

}
