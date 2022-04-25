# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
* 주어진횟수동안n대의자동차는전진또는멈출수있다.
* 각자동차에이름을부여할수있다.전진하는자동차를출력할때자동차이름을같이출력한다.
* 자동차이름은쉼표(,)를기준으로구분하며이름은5자이하만가능하다.
* 사용자는몇번의이동을할것인지를입력할수있어야한다.
* 전진하는조건은0에서9사이에서random값을구한후random값이4이상일경우전진하고,3이하의값이면멈
춘다.
* 자동차경주게임을완료한후누가우승했는지를알려준다.
* 우승자가한명이상일경우,쉼표(,)로이름을구분해출력한다.
* 사용자가잘못된값을입력할경우IllegalArgumentException를발생시키고,"[ERROR]"로시작하는에러메시지를
출력후그부분부터입력을다시받는다.
* Exception이아닌IllegalArgumentException,IllegalStateException등과같은명확한유형을처리한다.
기

## 입출력 요구사항
![img.png](img.png)

## 프로그램 실행 결과 예시
![img_1.png](img_1.png)
## 자동차 경주 구현 목록

* [ ] 입력 View
    * [ ] 자동차 시도횟수 메시지 출력 및 입력
    * [ ] 자동차 이름 메시지 출력 및 입력


* [ ] 출력 View
    * [ ] 자동차 이름과 문자 "-" 을 출력
      > pobi: ---<br>
      you: -----

    * [ ] 우승차 출력 메시지
      > 최종 우승: pobi, you


* [ ] 도메인별 기능
    * [ ] 1 ~ 9 랜덤숫자 생성
    * [ ] 차 이동 조건
        * [ ] 값이 4 ~ 9 사이일 경우
    * [ ] 우승자 조회


* [ ] 유효성 체크
    * [ ] IllegalArgumentException 처리
        * [ ] 이동조건 값 1 ~ 9의 범위에 없는 경우
        * [ ] 차이름 5글자 초과
        * [ ] 차이름 공백일 경우
        * [ ] 차이름 중복

* [ ] 도메인 객체 분리
    * [ ] RacingGame
    * [ ] Car
        * [ ] Movable 전략패턴
        * [ ] 생성자 인자 Position 객체로 변경
        * [ ] Position 비교 메서드
        * [ ] CarName 객체 적용
        * [ ] Position 객체 적용
        * [ ] TryCount 객체 적용
    * [ ] CarName
        * [ ] 유효성체크
            * [ ] 글자가 5자 초과시 예외
            * [ ] 공백일경우 예외
        * [ ] 일급 컬렉션
    * [ ] Cars
        * [ ] 모든차 이동
    * [ ] Position
        * [ ] Position 증가
        * [ ] Position 값 생성자 초기화
        * [ ] Position 비교 메서드
    * [ ] WinnerCars
        * [ ] 우승차 찾기
    * [ ] MovableStrategy
        * [ ] NormalMove
    * [ ] Random
    * [ ] TryCount
        * [ ] 시도횟수 초과시 예외
        * [ ] 시도횟수 기준 완료유무

----------------
