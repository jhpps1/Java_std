def is_acceptable(pwd):
    vowels = set("aeiou")  # {'a', 'e', 'i', 'o', 'u'}

    has_vowel = False
    vowel_count = 0
    consonant_count = 0
    prev_char = ''

    for char in pwd:
        # 1. 모음 여부 체크
        if char in vowels:
            has_vowel = True
            vowel_count += 1
            consonant_count = 0
        else:
            consonant_count += 1
            vowel_count = 0

        # 2. 모음 3개 or 자음 3개 연속
        if vowel_count == 3 or consonant_count == 3:
            return False

        # 3. 같은 글자 연속 (ee, oo는 예외)
        if char == prev_char and char not in ['e', 'o']:
            return False

        prev_char = char

    return has_vowel


while True:
    pwd = input().strip()
    if pwd == "end":
        break
    if is_acceptable(pwd):
        print(f"<{pwd}> is acceptable.")
    else:
        print(f"<{pwd}> is not acceptable.")
