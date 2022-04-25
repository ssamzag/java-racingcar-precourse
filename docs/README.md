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
