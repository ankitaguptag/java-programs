# java-programs





\# 📘 Git Commands Cheat Sheet (with Examples)



\## 🟦 1. `git clone`

\*\*Definition\*\*: Downloads (clones) a project from a GitHub repository to your local computer.



\*\*Command\*\*:

```bash

git clone <repo-url>

```



\*\*Example\*\*:

```bash

git clone git@github-your:yourusername/java-programs.git

```



---



\## 🟦 2. `git status`

\*\*Definition\*\*: Shows the status of files in the current working directory — what's modified, untracked, or staged.



\*\*Command\*\*:

```bash

git status

```



---



\## 🟦 3. `git add`

\*\*Definition\*\*: Stages (adds) your file changes to be included in the next commit.



\*\*Command\*\*:

```bash

git add <file>

\# or all files

git add .

```



\*\*Example\*\*:

```bash

git add HelloWorld.java

```



---



\## 🟦 4. `git commit`

\*\*Definition\*\*: Creates a commit — a snapshot of your project history — with a message.



\*\*Command\*\*:

```bash

git commit -m "Your message"

```



\*\*Example\*\*:

```bash

git commit -m "Added HelloWorld program"

```



---



\## 🟦 5. `git push`

\*\*Definition\*\*: Sends your commits to the remote GitHub repository.



\*\*Command\*\*:

```bash

git push origin main

```



---



\## 🟦 6. `git pull`

\*\*Definition\*\*: Fetches and merges the latest changes from the remote GitHub repo to your local machine.



\*\*Command\*\*:

```bash

git pull origin main

```



---



\## 🟦 7. `git config`

\*\*Definition\*\*: Sets user info or other settings. Can be global or local.



\*\*Commands\*\*:

```bash

\# Check current user

git config user.name

git config user.email



\# Set user for current project

git config user.name "Your Name"

git config user.email "your\_email@example.com"



\# Set global user

git config --global user.name "Your Name"

git config --global user.email "your\_email@example.com"

```



---



\## 🟦 8. `git log`

\*\*Definition\*\*: Shows commit history.



\*\*Command\*\*:

```bash

git log

```



---



\## 🟦 9. `git remote -v`

\*\*Definition\*\*: Lists the linked remote repositories (like GitHub).



\*\*Command\*\*:

```bash

git remote -v

```



---



\## 🟦 10. Shell Commands (`mkdir`, `mv`, `cd`)

| Command | Meaning | Example |

|--------|---------|---------|

| `mkdir` | Make a new folder | `mkdir Basic` |

| `mv` | Move files | `mv HelloWorld.java Basic/` |

| `cd` | Change directory | `cd java-programs` |



---



\## 🔰 Typical Workflow

```bash

git clone git@github-your:yourusername/java-programs.git

cd java-programs

git status

git add .

git commit -m "Your changes here"

git push origin main

```



---



\## 🛠 Common Fixes

| Problem | Solution |

|--------|----------|

| Wrong name/email | Set user with `git config` |

| Permission denied | Make sure SSH keys are added to GitHub |

| Ctrl+V not working | Use right-click in Git Bash |





