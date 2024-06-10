# FROM , COPY , RUN , CMD 정도만 알아도 기초적인 작업 할 수 있음.

# FROM 은 기존에 만들어진 이미지를 이용하겠다는 의미.
# 이미지는 대표적으로 도커허브에서 찾음.
# alpine을 가장 많이 사용하고, 때에 따라 ubuntu를 사용하기도 함.
# 리눅스 명령어가 익숙하지 않으면, 도커보다 리눅스부터 공부해야함.
FROM alpine

# COPY는 
# /usr/local/bin에 사용자가 만든 sh 파일들을 모아둠. 다른 경로에 둬도 무관함.
# FROM / COPY, RUN / CMD 구분해둔 이유는,
# FROM은 베이스 이미지를 가져오는 것이고,
# COPY, RUN, CMD는 이미지 파일을 만들 때 실행되는 명령어 docker에서는 instructor라고 부르기도 함.
# CMD는 이미지를 빌드할 때는 실행되지 않고, docker container run 명령어 실행 시 1번 실행되는 명령어.
COPY hithere.sh /usr/local/bin
RUN chmod +x /usr/local/bin/hithere.sh

CMD ["/usr/local/bin/hithere.sh"]

# docker --help
# docker image build
# docker container

# docker image build -t example/echo:lastest .
# -> -t 다음 이미지이름:태그
# 태그에는 버전을 넣어주면 됨.
# 마지막에 ( Dockerfile이 위치한 ) 현재경로를 뜻하는 . 을 넣어줘야함. 
# 도커가 실행되어야 명령어 실행 가능.

# FROM 으로 alpine을 가져오고, COPY, RUN 에 해당하는 명령들이 실행됐음.
# CMD는 컨테이너가 실행될 때 실행되는 명령어기 때문에 image build 시에는 실행되지 않음.

# docker container run example/echo:lastest
# Hi! there 가 실행되는 것을 볼 수 있음.
