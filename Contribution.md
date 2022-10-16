# CONTRIBUTING GUIDELINES 😄
If you think that you can add a new feature or want to fix a bug, we invite you to contribute to KeepIt's Notes App and make this project better. To start contributing, follow the below instructions:

1. Create a folder at your desired location at your desktop.

2. Open Git Bash Here

3. Create a Git repository.

4. Run command ``git init``

5. Fork this Repo

6. Clone your forked repository of project.

7. ```git clone https://github.com/<your_username>/KeepIt.git```

8. Navigate to the project directory.

9. ```cd KeepIt```
10. Add a reference(remote) to the original repository.
11. ```git remote add upstream https://github.com/aritra-tech/KeepIt.git```
12. Check the remotes for this repository.
    ```git remote -v```
13. Always take a pull from the upstream repository to your main branch to keep it updated as per the main project repository.
14. git pull upstream main
15. Create a new branch(prefer a branch name that relates to your assigned issue).
16. ```git checkout -b <YOUR_BRANCH_NAME>```
17. Perform your desired changes to the code base.

Check your changes.

- git status
- git  diff
- Stage your changes.
- git add . <\files_that_you_made_changes>
- Commit your changes.
- git commit -m "relavant message"
- Push the committed changes in your feature branch to your remote repository.
- git push -u origin <your_branch_name>
- To create a pull request, click on compare and pull requests.

- Add an appropriate title and description to your PR explaining your changes.

- Click on Create pull request.