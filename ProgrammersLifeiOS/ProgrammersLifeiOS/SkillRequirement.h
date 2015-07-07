//
//  SkillRequirement.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
@class Skill;

@interface SkillRequirement : NSObject{
    Skill *skill;
    int neededLevel;
}

-(BOOL)checkRequirement;

// getter methods
-(Skill*)getSkill;
-(int)getNeededLevel;

// setter methods
-(void)setSkill:(Skill*)value;
-(void)setNeededLevel:(int)value;

@end
