@echo off
set /p commit_msg="Digite a mensagem do commit: "

echo git fetch
git fetch...

echo git add... 
git add .

echo git commit...
git commit -m "%commit_msg%"

echo git push origin master...
git push origin master

echo git pull...
git pull origin master

pause