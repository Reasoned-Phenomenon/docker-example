# alpine은 jdk를 설치해야해서, jdk까지 설치되어 있는 openjdk 설치
FROM openjdk:17

# 도커파일이 있는 경로에서 시작해서, jar파일을 전송하고, 파일명은 다음 명령어를 쉽게 사용하기 위해 app.jar로 변경
COPY ./build/libs/bootdocker-0.0.1-SNAPSHOT.jar /usr/local/bin/app.jar
RUN chmod +x /usr/local/bin/app.jar

# java -jar app.jar 를 사용하려면, 띄워쓰기 단위로 분리해야함.
CMD ["java", "-jar", "/usr/local/bin/app.jar"]

# 외부의 8082 포트를 컨테이너 내부의 8080으로 연결
# name은 따로 지정하지 않으면 자동으로 생성 (eg, intelligent_swirles)
# docker container run -d -p 8082:8080 bootdocker:latest

# ls로 확인한 컨테이너의 ID(또는 name)를 사용해서 stop
# docker container ls
# docker container stop 669713888c45

# -a 옵션으로 정지상태의 컨테이너도 확인
# ls -a 로 확인한 컨테이너의 ID(또는 name)를 사용해서 restart
# docker container ls -a
# docker container restart 669713888c45

# 컨테이너 파기 -> 컨테이너의 ID(또는 name)를 사용해서 rm
# 실행중일때는 remove 불가 -> 정지해야함.
# 강제로 정지후 파기하는 옵션 -> -f
# docker container rm -f 669713888c45

# name 부여 하면서 container 실행
# 이미지명(bootdocker:latest)은 명령어의 제일 끝에 두는 것이 좋음.
# docker container run -d -p 8082:8080 --name bootdocker bootdocker:latest

# 이미지명으로 stop, restart 가능.
# docker container stop bootdocker
# docker container restart bootdocker

# 대부분의 명령어는 tool을 이용하면 돼서 다 외울 필요는 없음.
# log, exec
# tool 을 이용해서 attach shell을 사용하면, exec를 사용 할 수 있음. (아래 명령어를 실행하는 것과 같음)
# docker exec -it c70135f72e78ccac6b7a0657dfa6b69e783869dd52fa3dcce678bcf4edd89ed4 sh