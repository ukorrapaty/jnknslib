def call (String srcName = 'rebase.py') {
  echo "Parameter is : ${srcName}"
  sh "pwd"
  echo "${PWD}"
  sh "/bin/python3 ${srcName}"
}
