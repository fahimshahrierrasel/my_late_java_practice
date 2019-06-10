#!/bin/bash

# creating Problems List in a file
dirs=($(find * -maxdepth 0 -type d)) # getting the all directory of the project
echo "#### Problem(s)" > chapter.md
# loop through the directory
for dir in "${dirs[@]}"; do
  echo "* [$dir]($dir)" >> chapter.md
  # getting the sub directory of the current directory
  subdir=($(find $dir/* -maxdepth 0 -type d))
  # loop through the sub directory of the current directory
  for subdir in "${subdir[@]}"; do
  	# removing the parent direcory name
  	sdir=${subdir#"$dir/"}
  	echo "	* [$sdir]($subdir)" >> chapter.md
  done
done

# writing the readme header to README
cat includes/readme_header.md > README.md
echo -e "\n" >> README.md
# writing the chapters to README
cat chapter.md >> README.md
echo -e "\n" >> README.md
# writing the readme footer to README
cat includes/readme_footer.md >> README.md
echo -e "\n\n" >> README.md
# writing the timestamps to README
echo "This file generated on \``date`\`." >> README.md

# removing the chapter.md
rm chapter.md

# adding all changes to readme
git add -A

# promt for getting the commit message
read -p "Enter commit message: " COMMIT_MESSAGE
# commit with the inputed message
git commit -m "$COMMIT_MESSAGE"

git push

echo "Committed and Pushed 😀"
