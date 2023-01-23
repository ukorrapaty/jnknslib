def call (String srcName = 'rebase.py') {
  echo "Parameter is : ${srcName}"
  sh "/bin/python3 ${srcName}"
}
