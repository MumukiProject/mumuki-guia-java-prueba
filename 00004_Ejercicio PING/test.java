- name: El tiempo de ping tiene el formato correcto
  ping_time:
    match: !ruby/regexp '/^[0-9]{1,3}\.[0-9]{1,3}\s{0,1}\ms$/i'
    