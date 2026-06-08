package days19;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 *  사용자 정보 설정
		 *  
		 *  git config --global user.name "John Doe"
			git config --global user.email johndoe@example.com

			
			깃 로컬 저장소 생성(git init)
			
			C:\Class\GitClass\GitTest\SiSt-Workspace\JavaClass>git init
			Initialized empty Git repository in C:/Class/GitClass/GitTest/SiSt-Workspace/JavaClass/.git/

			C:\Class\GitClass\GitTest\SiSt-Workspace\JavaClass>code .
			
			github 원격(remote) 저장소 생성
			https://github.com/robin-korea/javaPro.git
			
			[…or create a new repository on the command line]
			echo "# javaPro" >> README.md
			git init
			git add README.md
			git commit -m "first commit"
			git branch -M main
			git remote add origin https://github.com/robin-korea/javaPro.git
			git push -u origin main
			
			[…or create a new repository on the command line]
			git remote add origin https://github.com/robin-korea/javaPro.git
			git branch -M main
			git push -u origin main
			
			파일 상태 보는거
			git status
			
			Untracked files: 저장소 안에 있지만 깃이 관리하지 않는 파일
			user@DESKTOP-J2G2JJC MINGW64 /c/Class/GitClass/GitTest/SiSt-Workspace/JavaClass (main)
			$ git status
			On branch main

			No commits yet

			Untracked files:
  			(use "git add <file>..." to include in what will be committed)
        		Hello.java

			nothing added to commit but untracked files present (use "git add" to track)
			
			git add 로 깃 이 관리하는 파일로 만든다
			
			git 커밋 방법
			git commit -m "Hello.java first Commit"
			
			# 1. 코드 수정 후 저장
			Ctrl + S

			# 2. 변경사항 확인
			git status

			# 3. 스테이징
			git add .

			# 4. 다시 확인 (선택사항이지만 추천)
			git status

			# 5. 커밋
			git commit -m "로그인 기능 추가"
			
			원격 저장소 이름 변경
			git remote add origin https://github.com/robin-korea/javaPro.git
			
			
			// 원격 저장소에 push 한 후
			
		    [집에 왔을때]
			 
			user@DESKTOP-J2G2JJC MINGW64 /c/Class/GitClass/GitTest/Home-Workspace/JavaClass
			
			1. Git 로컬 저장소 생성: 원격저장소를 복제(clone)해서 생성
			$ git clone https://github.com/robin-korea/javaPro.git

			
		 */


	}

}
