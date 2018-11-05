#! /bin/bash

echo '1.当前项目切换项目分支'
echo '2.当前项目拉代码'
echo '3.当前项目push 代码'
echo '4.上层目录所有项目切换分支'
echo '5.上层目录所有项目拉代码'
echo '6.上层目录所有项目push代码'

read -p  '命令选项: ' function


function pull-code(){

	gitbranch=$(git symbolic-ref --short -q HEAD)
	git pull origin ${gitbranch}
	
}

function push-code(){

	gitbranch=$(git symbolic-ref --short -q HEAD)
	git add . && git commit -m $1
	git pull origin ${gitbranch}
	git push origin ${gitbranch}

}

function checkout(){

	git pull
	git checkout $1

}

function operate(){




	fatherPath= pwd

	echo ${fatherPath}
	echo 'aaaaaa'

	case $1 in 
		1)
			local=$(pwd)
			echo $local
			read -p  '分支名: ' branchName
			checkout $branchName
		;;
		2)
			pull-code
		;;
		3)
			push-code
		;;
		4)
			read -p  '分支名: ' branchName
			fileNames=$(ls "${fatherPath}")
				for file in fileNames
					do
					checkout $branchName
					done
		;;
		5)
		
			fileNames=$(ls "${fatherPath}")
            	for file in fileNames
                	do
                    pull-code
                    done
		;;
		6)
		
			fileNames=$(ls "${fatherPath}")
            	for file in fileNames
                	do
                    push-code
                    done
		;;
		esac
}

operate ${function}


