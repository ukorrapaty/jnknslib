def call (String srcName = 'rebase.py') {
  final pythonContent = libraryResource(${srcName})
  echo "Parameter is : ${srcName}"
  sh "pwd"
  echo "${PWD}"
  sh "/bin/python3 ${srcName}"
}
