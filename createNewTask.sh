#!/bin/bash

TASK_NAME=$1

if [ -z "$TASK_NAME" ]
then
  echo "You need to provide task name"
  exit 1
fi

echo "Task name = $TASK_NAME"

echo -n "Creating main class in src. "
SRC_PATH="src/main/kotlin/com/mdolata/leetcode/$TASK_NAME"
mkdir -p "$SRC_PATH"
sed -e "s/TASK_NAME/$TASK_NAME/g" templates/srcFile.kt > "$SRC_PATH"/main.kt
echo "Done."

echo -n "Creating test class in test. "
TEST_PATH="src/test/kotlin/com/mdolata/leetcode/$TASK_NAME"
mkdir -p "$TEST_PATH"
sed -e "s/TASK_NAME/$TASK_NAME/g" templates/testFile.kt > "$TEST_PATH"/test.kt
echo "Done."

echo -n "Adding new files to git. "
git add "$SRC_PATH"/main.kt "$TEST_PATH"/test.kt
echo "Done."